package com.foodiehub_backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foodiehub_backend.entity.Dish;
import com.foodiehub_backend.entity.OrderEntity;
import com.foodiehub_backend.entity.Restaurant;
import com.foodiehub_backend.repository.DishRepository;
import com.foodiehub_backend.repository.OrderRepository;
import com.foodiehub_backend.repository.RestaurantRepository;
import com.foodiehub_backend.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private RestaurantRepository restaurantRepository;
    private DishRepository dishRepository;

    public OrderServiceImpl(OrderRepository orderRepository,
                            RestaurantRepository restaurantRepository,
                            DishRepository dishRepository) {
        this.orderRepository = orderRepository;
        this.restaurantRepository = restaurantRepository;
        this.dishRepository = dishRepository;
    }

    @Override
    public OrderEntity placeOrder(Long restaurantId, Long dishId, int quantity) {

        Restaurant restaurant = restaurantRepository.findById(restaurantId)
                .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        Dish dish = dishRepository.findById(dishId)
                .orElseThrow(() -> new RuntimeException("Dish not found"));

        OrderEntity order = new OrderEntity();
        order.setRestaurant(restaurant);
        order.setDish(dish);
        order.setQuantity(quantity);
        order.setTotalPrice(dish.getPrice() * quantity);
        order.setStatus("PLACED");

        return orderRepository.save(order);
    }

    @Override
    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }
}
