package com.ecom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Product;
import com.ecom.repo.productDao;

@Service
public class ProductServicesImpl implements ProductServices {

	@Autowired
	private productDao Pdao;
	
	@Override
	public Product AddProduct(Product product) {
		// TODO Auto-generated method stub
		Product data=Pdao.save(product);
		return data;
	}

}
