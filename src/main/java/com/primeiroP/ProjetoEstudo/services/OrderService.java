package com.primeiroP.ProjetoEstudo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.primeiroP.ProjetoEstudo.entities.Order;
import com.primeiroP.ProjetoEstudo.repositories.OrderRepository;

@Repository
public class OrderService {

  @Autowired
  private OrderRepository repository;

  public Order findById(Integer id) {
    return repository.findById(id).get();
  }

  public List<Order> findAll() {
    return repository.findAll();
  }
}
