package com.example.demo.controller;

import com.example.demo.model.Food;
import com.example.demo.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
public class FoodController {

    private final FoodService foodService;

    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    // Create food
    @PostMapping
    public Food createFood(@RequestBody Food food) {
        return foodService.createFood(food);
    }

    // Get all foods
    @GetMapping
    public List<Food> getAllFoods() {
        return foodService.getAllFoods();
    }

    // Get food by ID
    @GetMapping("/{id}")
    public Food getFoodById(@PathVariable Long id) {
        return foodService.getFoodById(id);
    }

    // Update food
    @PutMapping("/{id}")
    public Food updateFood(
            @PathVariable Long id,
            @RequestBody Food food) {

        return foodService.updateFood(id, food);
    }

    // Delete food
    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        foodService.deleteFood(id);
    }
}