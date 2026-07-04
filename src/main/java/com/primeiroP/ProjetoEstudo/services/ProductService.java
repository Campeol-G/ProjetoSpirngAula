package com.primeiroP.ProjetoEstudo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiroP.ProjetoEstudo.entities.Product;
import com.primeiroP.ProjetoEstudo.repositories.ProductRepository;

@Service
public class ProductService {

  @Autowired
  private ProductRepository repository;

  public Product findById(Integer id) {
    return repository.findById(id).get();
  }

  public List<Product> findAll() {
    return repository.findAll();
  }
}
