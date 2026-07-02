package com.primeiroP.ProjetoEstudo.repositories;

import com.primeiroP.ProjetoEstudo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
