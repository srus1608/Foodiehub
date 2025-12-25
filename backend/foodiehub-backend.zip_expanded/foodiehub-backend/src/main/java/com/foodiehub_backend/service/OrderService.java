package com.foodiehub_backend.service;

import java.util.List;
import com.foodiehub_backend.entity.OrderEntity;

public interface OrderService {

    OrderEntity placeOrder(Long restaurantId, Long dishId, int quantity);

    List<OrderEntity> getAllOrders();
}
