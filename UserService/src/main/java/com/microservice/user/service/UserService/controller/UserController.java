package com.microservice.user.service.UserService.controller;


import com.microservice.user.service.UserService.entities.User;
import com.microservice.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    //create
    @PostMapping
    public ResponseEntity<User>createUser(@RequestBody User user)//whatever data comes in JSON in the body, will be converted to the Object then.
    {
        User savedUser = this.userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    //single user get
    @GetMapping("/{userId}")
    public ResponseEntity<User>getuser(@PathVariable String userId)
    {
        User user = this.userService.getUser(userId);
        return new  ResponseEntity<User>(user,HttpStatus.FOUND);
    }

    //all user get
    @GetMapping
    public ResponseEntity<List<User>>getAllUsers()
    {
        List<User>users = this.userService.getAllUsers();
        return new ResponseEntity<>(users,HttpStatus.FOUND);
    }

}
