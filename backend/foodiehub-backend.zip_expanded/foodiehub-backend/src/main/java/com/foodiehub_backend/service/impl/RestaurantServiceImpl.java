package com.foodiehub_backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foodiehub_backend.entity.Restaurant;
import com.foodiehub_backend.repository.RestaurantRepository;
import com.foodiehub_backend.service.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private RestaurantRepository restaurantRepository;

    // Constructor Injection (BEST PRACTICE)
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }
}
