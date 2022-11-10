package com.ecom.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Categorys;
import com.ecom.repo.CategoryDao;

@Service
public class CategoryServiceImpl implements CategoryServices {

	@Autowired
	private CategoryDao Cdao;
	
	@Override
	public Categorys AddCategory(Categorys cat) {
		// TODO Auto-generated method stub
	
		Categorys data= Cdao.save(cat);
		
		
		return data;
	}

	@Override
	public String DeleteCategory(Integer id) {
		// TODO Auto-generated method stub
		String ans="Not Found";
		Optional<Categorys> data= Cdao.findById(id);
		if(data.isPresent()) {
			Cdao.delete(data.get());
			ans="Deleted";
			return ans;
		}else {
			return ans;
		}
	}

	@Override
	public Categorys UpdatedCategory(Integer id, Categorys cat) {
		// TODO Auto-generated method stub
		Optional<Categorys> data= Cdao.findById(id);
		if(data.isPresent()) {
		 Cdao.save(cat);
		 return data.get();		}
		
		return null;
	}

	@Override
	public List<Categorys> AllCategorys() {
		// TODO Auto-generated method stub
		 List<Categorys> data= Cdao.findAll();
		return data;
	}

}
