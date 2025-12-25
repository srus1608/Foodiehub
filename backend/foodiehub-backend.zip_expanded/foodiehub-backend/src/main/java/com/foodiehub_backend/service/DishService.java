package com.foodiehub_backend.service;

import java.util.List;
import com.foodiehub_backend.entity.Dish;

public interface DishService {

    Dish addDish(Long restaurantId, Dish dish);

    List<Dish> getDishesByRestaurant(Long restaurantId);
}
