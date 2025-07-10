package com.example.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.catalog.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
