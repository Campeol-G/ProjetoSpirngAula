package com.primeiroP.ProjetoEstudo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.primeiroP.ProjetoEstudo.entities.User;
import com.primeiroP.ProjetoEstudo.repositories.UserRepository;
import com.primeiroP.ProjetoEstudo.services.exceptions.DataBaseException;
import com.primeiroP.ProjetoEstudo.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User findById(Integer id) {
    return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    // o .get no final dessa expressao serve pra rentornar o tipo do Optional
  }

  public User insert(User obj) {
    return repository.save(obj);
  }

  public void delete(Integer id) {
    if (!repository.existsById(id)) {
      throw new ResourceNotFoundException(id);
    }
    try {
      repository.deleteById(id);
    } catch (DataIntegrityViolationException e) {
      throw new DataBaseException(e.getMessage());
    }
  }

  public User update(Integer id, User obj) {
    // getReferenceById apenas instancia esse usuario e o deixa sob vigia do JPA,
    // para nos conseguirmos trabalhar com ele, sem necessariamente entrar em
    // contato direto com o banco de dados
    try {
      User entity = repository.getReferenceById(id);
      updateData(entity, obj);
      return repository.save(entity);
    } catch (EntityNotFoundException e) {
      throw new ResourceNotFoundException(id);
    }
  }

  private void updateData(User u1, User u2) {
    u1.setName(u2.getName());
    u1.setEmail(u2.getEmail());
    u1.setPhone(u2.getPhone());
  }
}
