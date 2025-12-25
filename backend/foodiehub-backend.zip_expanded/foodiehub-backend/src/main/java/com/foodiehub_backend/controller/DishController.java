package com.foodiehub_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.foodiehub_backend.entity.Dish;
import com.foodiehub_backend.service.DishService;

@RestController
@RequestMapping("/api/dishes")
@CrossOrigin(origins = "*")
public class DishController {

    private DishService dishService;

    public DishController(DishService dishService) {
        this.dishService = dishService;
    }

    @PostMapping("/restaurant/{restaurantId}")
    public Dish addDish(@PathVariable Long restaurantId,
                        @RequestBody Dish dish) {
        return dishService.addDish(restaurantId, dish);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public List<Dish> getDishesByRestaurant(@PathVariable Long restaurantId) {
        return dishService.getDishesByRestaurant(restaurantId);
    }
}
