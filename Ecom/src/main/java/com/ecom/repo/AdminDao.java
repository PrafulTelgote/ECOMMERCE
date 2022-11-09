package com.ecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.model.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer> {

}
