package com.primeiroP.ProjetoEstudo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiroP.ProjetoEstudo.entities.Product;
import com.primeiroP.ProjetoEstudo.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

  @Autowired
  private ProductService service;

  @GetMapping(value = "/{id}")
  public ResponseEntity<Product> findById(@PathVariable Integer id) {
    return ResponseEntity.ok(service.findById(id));
  }

  @GetMapping
  public ResponseEntity<List<Product>> findAll() {
    return ResponseEntity.ok().body(service.findAll());
  }
}
