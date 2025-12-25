package com.foodiehub_backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foodiehub_backend.entity.Dish;
import com.foodiehub_backend.entity.Restaurant;
import com.foodiehub_backend.repository.DishRepository;
import com.foodiehub_backend.repository.RestaurantRepository;
import com.foodiehub_backend.service.DishService;

@Service
public class DishServiceImpl implements DishService {

    private DishRepository dishRepository;
    private RestaurantRepository restaurantRepository;

    public DishServiceImpl(DishRepository dishRepository,
                           RestaurantRepository restaurantRepository) {
        this.dishRepository = dishRepository;
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Dish addDish(Long restaurantId, Dish dish) {
        Restaurant restaurant = restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        dish.setRestaurant(restaurant);
        return dishRepository.save(dish);
    }

    @Override
    public List<Dish> getDishesByRestaurant(Long restaurantId) {
        return dishRepository.findByRestaurantId(restaurantId);
    }
}
