//package madrabbit.priority.priorityspring.web;
//
//import lombok.RequiredArgsConstructor;
//import madrabbit.priority.priorityspring.pojo.Users;
//import madrabbit.priority.priorityspring.service.UserServiceImpl;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping("/api/user")
//public class UserController {
//
//    UserServiceImpl userService;
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Users> getUser(@PathVariable Long id){
//        return new ResponseEntity<>(userService.getUser(id),HttpStatus.OK);
//    }
//
//    @PostMapping("/save")
//    public ResponseEntity<Users> saveUser(@RequestBody Users user){
//        return new ResponseEntity<>(userService.saveUser(user),HttpStatus.CREATED);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long id){
//        userService.deleteUser(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//}
