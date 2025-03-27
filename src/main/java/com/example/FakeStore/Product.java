package com.example.FakeStore;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}

