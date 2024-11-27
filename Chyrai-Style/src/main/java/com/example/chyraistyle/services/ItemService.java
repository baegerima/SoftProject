package com.example.chyraistyle.services;

import com.example.chyraistyle.entities.ItemEntity;
import com.example.chyraistyle.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public List<ItemEntity> getAllItems() {
        return itemRepository.findAll();
    }

    public ItemEntity getItemById(Long id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with id " + id));
    }

    public ItemEntity createItem(ItemEntity item) {
        return itemRepository.save(item);
    }

    public ItemEntity updateItem(Long id, ItemEntity updatedItem) {
        ItemEntity item = itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with id " + id));
        item.setName(updatedItem.getName());
        item.setCategory(updatedItem.getCategory());
        item.setColor(updatedItem.getColor());
        item.setSeason(updatedItem.getSeason());
        item.setWeatherType(updatedItem.getWeatherType());
        return itemRepository.save(item);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
