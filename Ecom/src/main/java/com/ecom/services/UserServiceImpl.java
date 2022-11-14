package com.ecom.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.model.Cart;
import com.ecom.model.Item;
import com.ecom.model.Product;
import com.ecom.model.User;
import com.ecom.repo.CartDao;
import com.ecom.repo.ItemDao;
import com.ecom.repo.ProductDao;
import com.ecom.repo.UserDao;

@Service
public class UserServiceImpl implements UserServices {

	@Autowired
	private UserDao Udao;
	
	@Autowired
	private ProductDao Pdao;
	
	@Autowired
	private CartDao Cdao;
	
	@Autowired
	private ItemDao Idao;
	
	
	@Override
	public User Register(User user) {
		// TODO Auto-generated method stub
		User data= Udao.save(user);
		
		return data;
	}

	@Override
	public User UpdateUser(Integer id, User user) {
		// TODO Auto-generated method stub
	  Optional<User> data=  Udao.findById(id);
	  if(data.isPresent()) {
		  User Pdata=data.get();
		  Pdata.setName(user.getName());
		  Pdata.setAddress(user.getAddress());
		  Pdata.setEmail(user.getEmail());
		  Pdata.setMobile(user.getMobile());
		 User Udata=  Udao.save(Pdata);
		 return Udata;
		 
	  }
		
		return null;
	}

	@Override
	public String DeleteUser(Integer id) {
		// TODO Auto-generated method stub
		
		Optional<User> data=Udao.findById(id);
		if(data.isPresent()) {
			Udao.delete(data.get());
			return "User deleted";
		}
		return "User Not Deleted";
	}

	@Override
	public List<Product> product() {
		// TODO Auto-generated method stub
		List<Product> product=Pdao.findAll();
		
		return product;
	}

	@Override
	public String product(Integer userid, Integer productid) {
		// TODO Auto-generated method stub
		Item items=new Item();
		Cart cart=new Cart();
		Optional<User> data= Udao.findById(userid);
		Optional<Product> Pdata=Pdao.findById(productid);
		if(data.isPresent() && Pdata.isPresent()) {
			items.setProduct(Pdata.get());
			items.setQuantity(10);
//			items.setTotal(Pdata.get().getSaleprice()*10);
			Idao.save(items);
//			Double total=0.0;
			Set<Item> cartdata= cart.getItems();
//			for(Item i:cartdata) {
////				System.out.println(i);
//				total=total+i.getTotal();
//			}
////			System.out.println(total);
//			cart.setTotal(total);
			
			cartdata.add(items);
			
			cart.setUser(data.get());
			Cdao.save(cart);
			return "yse";
		}else {
			return "no";
		}
		

	}

	

	

	
	
	


}
