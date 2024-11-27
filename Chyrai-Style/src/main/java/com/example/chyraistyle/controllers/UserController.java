package com.example.chyraistyle.controllers;

import com.example.chyraistyle.entities.UserEntity;
import com.example.chyraistyle.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Получение всех пользователей
    @GetMapping("/get-all")
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    // Создание нового пользователя
    @PostMapping("/create")
    public UserEntity createUser(@RequestBody UserEntity user) {
        return userRepository.save(user);
    }

    // Обновление пользователя
    @PutMapping("/update/{id}")
    public UserEntity updateUser(@PathVariable Long id, @RequestBody UserEntity updatedUser) {
        UserEntity user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id " + id));
        user.setUsername(updatedUser.getUsername());
        user.setEmail(updatedUser.getEmail());
        user.setPassword(updatedUser.getPassword());
        return userRepository.save(user);
    }

    // Удаление пользователя
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}

