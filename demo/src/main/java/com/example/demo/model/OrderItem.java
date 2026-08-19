package com.example.demo.model;

import java.util.List;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Food food;
    private int quantity;
    private double price;
}