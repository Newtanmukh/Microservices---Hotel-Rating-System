package com.microservice.user.service.UserService.services;

import com.microservice.user.service.UserService.entities.User;

import java.util.List;

public interface UserService {

    //create
    User saveUser(User user);

    //get all user
    List<User>getAllUsers();

    //get user of given user id
    User getUser(String userId);

    //delete
    void deleteUser(String userId);

    //update
    User updateUser(String userId,User user);

}
