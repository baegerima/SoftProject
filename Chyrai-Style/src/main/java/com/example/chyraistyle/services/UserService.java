package com.example.chyraistyle.services;

import com.example.chyraistyle.entities.UserEntity;
import com.example.chyraistyle.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity findByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found with username: " + username));
    }

    public UserEntity registerUser(UserEntity user) {
        return userRepository.save(user);
    }
}

