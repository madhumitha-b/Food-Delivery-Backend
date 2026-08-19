package com.example.demo.model;

import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int orderId;
    private List<OrderItem> items;
    private double totalPrice;
    private DeliveryPartner deliveryPartner;
}