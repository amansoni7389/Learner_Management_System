package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.User;
import com.app.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Method to add or update a user (Admin, Teacher, Student)
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // Method to retrieve all users (Admins, Teachers, Students)
    
    // Method to delete a user by ID
    public void deleteUser(Long userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            userRepository.delete(user.get());
        } else {
            throw new RuntimeException("User not found with ID: " + userId);
        }
    }
}