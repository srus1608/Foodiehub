package com.foodiehub_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.foodiehub_backend.dto.OrderRequest;
import com.foodiehub_backend.entity.OrderEntity;
import com.foodiehub_backend.service.OrderService;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    
    @PostMapping
    public OrderEntity placeOrder(@RequestBody OrderRequest orderRequest) {
        return orderService.placeOrder(
                orderRequest.getRestaurantId(),
                orderRequest.getDishId(),
                orderRequest.getQuantity()
        );
    }


    @GetMapping
    public List<OrderEntity> getAllOrders() {
        return orderService.getAllOrders();

//    @PostMapping
//    public OrderEntity placeOrder(@RequestParam Long restaurantId,
//                                  @RequestParam Long dishId,
//                                  @RequestParam int quantity) {
//        return orderService.placeOrder(restaurantId, dishId, quantity);
//    }
//
//    @GetMapping
//    public List<OrderEntity> getAllOrders() {
//        return orderService.getAllOrders();
    }
}


