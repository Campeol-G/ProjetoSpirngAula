package com.primeiroP.ProjetoEstudo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiroP.ProjetoEstudo.entities.Order;
import com.primeiroP.ProjetoEstudo.repositories.OrderRepository;
import com.primeiroP.ProjetoEstudo.services.exceptions.ResourceNotFoundException;

@Service
public class OrderService {

  @Autowired
  private OrderRepository repository;

  public Order findById(Integer id) {
    return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
  }

  public List<Order> findAll() {
    return repository.findAll();
  }
}
