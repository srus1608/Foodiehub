package com.foodiehub_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodiehub_backend.entity.Dish;

public interface DishRepository extends JpaRepository<Dish, Long> {

    List<Dish> findByRestaurantId(Long restaurantId);
}
