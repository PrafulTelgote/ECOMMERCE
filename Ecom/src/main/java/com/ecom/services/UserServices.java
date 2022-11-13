package com.ecom.services;

import java.util.List;

import com.ecom.model.Product;
import com.ecom.model.User;

public interface UserServices {
	
	public User Register(User user);
	public User UpdateUser(Integer id, User user);
	public String DeleteUser(Integer id);
	
	public String product(Integer userid,Integer productid);
	
	
	
	
}
