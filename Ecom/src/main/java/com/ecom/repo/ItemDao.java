package com.ecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.Item;

public interface ItemDao extends JpaRepository<Item, Integer> {

}
