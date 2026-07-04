package com.primeiroP.ProjetoEstudo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiroP.ProjetoEstudo.entities.User;
import com.primeiroP.ProjetoEstudo.repositories.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User findById(Integer id) {
    return repository.findById(id).get();
    // o .get no final dessa expressao serve pra rentornar o tipo do Optional
  }
}
