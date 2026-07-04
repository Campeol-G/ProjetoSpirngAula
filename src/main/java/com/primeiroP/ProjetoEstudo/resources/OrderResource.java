package com.primeiroP.ProjetoEstudo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiroP.ProjetoEstudo.entities.Order;
import com.primeiroP.ProjetoEstudo.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

  @Autowired
  private OrderService service;

  @GetMapping(value = "/{id}")
  public ResponseEntity<Order> findById(@PathVariable Integer id) {
    Order o = service.findById(id);
    return ResponseEntity.ok(o);
  }

  @GetMapping
  public ResponseEntity<List<Order>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }
}
