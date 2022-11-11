package com.ecom.services;

import java.util.List;

import com.ecom.model.Product;

public interface ProductServices {

	
	public Product AddProduct(Product product);
	public List<Product> GetProducts();
	public Product UpdateProduct(Integer id,Product product);
}
