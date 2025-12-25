package com.foodiehub_backend.service;

import java.util.List;
import com.foodiehub_backend.entity.Restaurant;

public interface RestaurantService {

    Restaurant addRestaurant(Restaurant restaurant);

    List<Restaurant> getAllRestaurants();
}
