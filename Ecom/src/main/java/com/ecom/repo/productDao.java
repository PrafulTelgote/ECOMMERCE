package com.ecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.Product;

public interface productDao extends JpaRepository<Product, Integer> {

}
