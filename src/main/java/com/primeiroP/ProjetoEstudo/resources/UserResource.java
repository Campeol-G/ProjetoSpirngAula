package com.primeiroP.ProjetoEstudo.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiroP.ProjetoEstudo.entities.User;
import com.primeiroP.ProjetoEstudo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @Autowired
  private UserService service;

  @GetMapping
  public ResponseEntity<List<User>> findAll() {
    List<User> list = service.findAll();
    return ResponseEntity.ok().body(list);
  }

  // o value pra dizer q a URL vai ter um parametro
  // a requisicao aceita um ID dentro da URL
  @GetMapping(value = { "/{id}" })
  public ResponseEntity<User> findByID(@PathVariable Integer id) {
    // o path PathVariable eh pra fazer essa funcao pegar o id da URL e usar pra
    // fazer a busca no DB
    User u = service.findById(id);
    return ResponseEntity.ok().body(u);
  }
}
