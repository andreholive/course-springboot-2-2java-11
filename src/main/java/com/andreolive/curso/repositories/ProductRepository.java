package com.andreolive.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andreolive.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
