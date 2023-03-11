package madrabbit.priority.priorityspring.service;

import lombok.AllArgsConstructor;
import madrabbit.priority.priorityspring.pojo.Users;
import madrabbit.priority.priorityspring.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    UserRepository userRepository;

    public Users getUser(Long id){
        return userRepository.findById(id).get();
    }

    public Users saveUser(Users user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
