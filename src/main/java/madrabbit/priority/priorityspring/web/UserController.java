package madrabbit.priority.priorityspring.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import madrabbit.priority.priorityspring.pojo.User;
import madrabbit.priority.priorityspring.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {

    ObjectMapper objectMapper = new ObjectMapper();
    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/byId/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User content) {
        return userService.create(content);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<HttpStatus> updateUser(@PathVariable Long id, @RequestBody String newuser) {
//
//        User users = userService.getById(id);
//        users
//
//        return new ResponseEntity<>(HttpStatus.OK);
//
//    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.delete(id);
    }

}
