package madrabbit.priority.priorityspring.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import madrabbit.priority.priorityspring.exceptions.UserNotFoundException;
import madrabbit.priority.priorityspring.pojo.User;
import madrabbit.priority.priorityspring.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    ObjectMapper objectMapper = new ObjectMapper();
     private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User getById(Long id) {
        User user = unwrappedContent(userRepository.findById(id), id);
        return user;
    }

    public User create(User entity) {
        return userRepository.save(entity);
    }

//    public void update(Long id, User entityDetails) {
//        User entity = unwrappedContent(userRepository.findById(id), id);
//        entity.setUsername(entity.getUsername());
//        entity.setPassword(entity.getPassword());
//        userRepository.save(entity);
//    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    private User unwrappedContent(Optional<User> entity, Long id) {
        if (entity.isPresent()) {
            return entity.get();
        } else throw new UserNotFoundException(id);
    }
}
