package com.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Admin;
import com.ecom.services.AdminServices;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class AdminCotroller {
	
	@Autowired
	private AdminServices services;
	
	@PostMapping("/adminregister")
public ResponseEntity<Admin> RegisterHandler(@RequestBody Admin admin){
	
		Admin data= services.Register(admin);
		return new ResponseEntity<Admin>(data, HttpStatus.CREATED);
	
	
}

}
