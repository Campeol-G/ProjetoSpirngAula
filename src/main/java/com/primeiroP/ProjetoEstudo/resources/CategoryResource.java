package com.primeiroP.ProjetoEstudo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiroP.ProjetoEstudo.entities.Category;
import com.primeiroP.ProjetoEstudo.services.CategoryService;

@RestController
@RequestMapping(value = "/categorys")
public class CategoryResource {

  @Autowired
  private CategoryService service;

  @GetMapping(value = "/{id}")
  public ResponseEntity<Category> findById(@PathVariable Integer id) {
    Category c = service.findById(id);
    return ResponseEntity.ok(c);
  }

  @GetMapping
  public ResponseEntity<List<Category>> findAll() {
    return ResponseEntity.ok().body(service.findAll());
  }
}
