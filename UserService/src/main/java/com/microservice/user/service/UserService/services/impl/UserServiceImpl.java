package com.microservice.user.service.UserService.services.impl;

import com.microservice.user.service.UserService.entities.User;
import com.microservice.user.service.UserService.exceptions.ResourceNotFoundExceptions;
import com.microservice.user.service.UserService.repositories.UserRepository;
import com.microservice.user.service.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String randomuserId = UUID.randomUUID().toString();
        user.setUserId(randomuserId);
        User savedUser = this.userRepository.save(user);
        return savedUser;
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return this.userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundExceptions("User with given Id could not be found on the server : " + userId));
    }

    @Override
    public void deleteUser(String userId) {

    }

    @Override
    public User updateUser(String userId, User user) {
        return null;
    }
}
