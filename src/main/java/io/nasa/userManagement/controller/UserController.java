package io.nasa.userManagement.controller;

import io.nasa.userManagement.model.User;
import io.nasa.userManagement.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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
}
