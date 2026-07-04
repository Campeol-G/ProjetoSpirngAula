package com.primeiroP.ProjetoEstudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroP.ProjetoEstudo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
