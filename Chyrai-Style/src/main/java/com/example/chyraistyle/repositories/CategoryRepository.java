package com.example.chyraistyle.repositories;

import com.example.chyraistyle.entities.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {}
