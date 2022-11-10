package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Product;
import com.ecom.model.productDto;
import com.ecom.services.ProductServices;

@RestController
public class ProductController {

	@Autowired
	private ProductServices services;
	
	@PostMapping("/admin/addproduct")
	ResponseEntity<Product> AddProductHandler(Product product){
		Product data= services.AddProduct(product);
		return new ResponseEntity<Product>(data, HttpStatus.CREATED);
	}
	
	public ResponseEntity<List<Product>> getallProduct(){
		List<Product> data=services.GetAllProduct();
		return new ResponseEntity<List<Product>>(data, HttpStatus.OK);
	}
}
