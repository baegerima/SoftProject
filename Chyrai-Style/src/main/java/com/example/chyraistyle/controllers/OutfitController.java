package com.example.chyraistyle.controllers;

import com.example.chyraistyle.entities.OutfitEntity;
import com.example.chyraistyle.services.OutfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/outfits")
public class OutfitController {

    @Autowired
    private OutfitService outfitService;

    // Получение всех образов
    @GetMapping
    public List<OutfitEntity> getAllOutfits() {
        return outfitService.getAllOutfits();
    }

    // Генерация нового образа
    @PostMapping("/generate")
    public OutfitEntity generateOutfit(@RequestBody OutfitEntity outfit) {
        return outfitService.generateOutfit(outfit);
    }

    // Удаление образа
    @DeleteMapping("/delete/{id}")
    public void deleteOutfit(@PathVariable Long id) {
        outfitService.deleteOutfit(id);
    }
}
