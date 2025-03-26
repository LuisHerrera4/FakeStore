package com.example.FakeStore;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Product {
    public int id;
    public String title;
    public double price;
    public String category;
    public String description;
    public String image;
}

