package com.ecom.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Categorys;
import com.ecom.model.Product;
import com.ecom.repo.CategoryDao;
import com.ecom.repo.productDao;


@Service
public class ProductServicesImpl implements ProductServices {

	@Autowired
	private productDao Pdao;
	
	@Autowired
	private CategoryDao Cdao;
	
	@Override
	public Product AddProduct(Product product) {
		// TODO Auto-generated method stub
		Optional<Categorys> cat= Cdao.findById(product.getCategorys().getCatId());
		if(cat.isPresent()) {
			cat.get().getProduct().add(product);
			Product data=Pdao.save(product);
			return data;
		}
		else {
			System.out.println("Categoey not found");
			return null;
		}
		
		
		
	}

	@Override
	public List<Product> GetProducts() {
		// TODO Auto-generated method stub
//		System.out.println("data");
		List<Product> data= Pdao.findAll();
//		System.out.println("data 2");
		return data;
	}

	@Override
	public Product UpdateProduct(Integer id, Product product) {
		// TODO Auto-generated method stub
//		 Optional<Product> data= Pdao.findById(id);
//		 if(data.isPresent()) {
//			 data.get().setCategorys(null);
//			 data.get().setImg(null);
//			 data.get().setMarketPrice();
//			 data.get()
//			 }
		return null;
	}
	
}
