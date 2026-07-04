package com.primeiroP.ProjetoEstudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroP.ProjetoEstudo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
