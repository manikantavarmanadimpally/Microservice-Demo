package com.microservicesdemo.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicesdemo.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
