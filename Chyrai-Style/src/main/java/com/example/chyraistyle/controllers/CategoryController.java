package com.example.chyraistyle.controllers;

import com.example.chyraistyle.entities.CategoryEntity;
import com.example.chyraistyle.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    // Получение всех категорий
    @GetMapping
    public List<CategoryEntity> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Создание новой категории
    @PostMapping("/create")
    public CategoryEntity createCategory(@RequestBody CategoryEntity category) {
        return categoryRepository.save(category);
    }

    // Удаление категории
    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryRepository.deleteById(id);
    }
}
