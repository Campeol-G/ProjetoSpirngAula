package com.primeiroP.ProjetoEstudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroP.ProjetoEstudo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
