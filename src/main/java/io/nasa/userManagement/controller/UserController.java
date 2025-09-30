package io.nasa.userManagement.controller;

import io.nasa.userManagement.model.User;
import io.nasa.userManagement.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    @PostMapping("")
    public User create(@RequestBody  User user){
        User response = userService.create(user);
        return response;
    }
    @GetMapping("")
    public List<User> getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "id") Long id){
        return userService.getUser(id);
    }

    @PutMapping("/{id}")
    public User updateUserById(@PathVariable(value = "id") Long id,@RequestBody User user){
        return userService.updateUser(user);
    }
}
