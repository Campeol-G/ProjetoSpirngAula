package com.primeiroP.ProjetoEstudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroP.ProjetoEstudo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
