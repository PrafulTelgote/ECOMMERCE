package com.ecom.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.Cart;
import com.ecom.model.User;

public interface CartDao extends JpaRepository<Cart, Integer> {

	public Optional<User> findByuser(Integer id);
	
}
