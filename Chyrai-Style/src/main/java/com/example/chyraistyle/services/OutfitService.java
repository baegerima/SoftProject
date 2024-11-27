package com.example.chyraistyle.services;

import com.example.chyraistyle.entities.OutfitEntity;
import com.example.chyraistyle.repositories.OutfitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutfitService {

    @Autowired
    private OutfitRepository outfitRepository;

    // Получение всех образов
    public List<OutfitEntity> getAllOutfits() {
        return outfitRepository.findAll();
    }

    // Генерация нового образа
    public OutfitEntity generateOutfit(OutfitEntity outfit) {
        // Здесь можно добавить логику для фильтрации вещей по погоде и сезону
        return outfitRepository.save(outfit);
    }

    // Удаление образа
    public void deleteOutfit(Long id) {
        outfitRepository.deleteById(id);
    }
}
