package com.andreolive.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreolive.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
