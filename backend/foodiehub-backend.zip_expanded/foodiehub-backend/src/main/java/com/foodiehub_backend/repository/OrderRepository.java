package com.foodiehub_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodiehub_backend.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
