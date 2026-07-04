package com.primeiroP.ProjetoEstudo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiroP.ProjetoEstudo.entities.Category;
import com.primeiroP.ProjetoEstudo.repositories.CategoryRepository;

@Service
public class CategoryService {

  @Autowired
  private CategoryRepository repository;

  public Category findById(Integer id) {
    return repository.findById(id).get();
  }

  public List<Category> findAll() {
    return repository.findAll();
  }
}
