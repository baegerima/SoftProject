package com.example.chyraistyle.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;

@Entity
@Table(name = "outfits")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OutfitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToMany
    @JoinTable(
            name = "outfit_items",
            joinColumns = @JoinColumn(name = "outfit_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    List<ItemEntity> items;

    @Column(nullable = false, length = 50) // Название образа
    String name;

    @Column(length = 50) // Сезон
    String season;

    @Column(length = 50) // Погода
    String weatherType;

    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity user;
}
