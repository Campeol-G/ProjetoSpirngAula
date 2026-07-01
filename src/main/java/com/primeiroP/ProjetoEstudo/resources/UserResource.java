package com.primeiroP.ProjetoEstudo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiroP.ProjetoEstudo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
  public ResponseEntity<User> findAll() {
    User u = new User(1, "Joao", "Joao@gmail.com", "999299292", "fortnite");
    return ResponseEntity.ok().body(u);
  }
}
