package com.ecom.model;



import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Cartid;
	
	
	@OneToMany
	private Set<Item> items=new HashSet<Item>();
	
	private Float total;
	
	@OneToOne
	@JoinColumn(name = "UserId",referencedColumnName = "userid")
	private User user;
	
	
	
    
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Cart() {
		// TODO Auto-generated constructor stub
	}


	public Integer getCartid() {
		return Cartid;
	}


	public void setCartid(Integer cartid) {
		Cartid = cartid;
	}


	public Set<Item> getItems() {
		return items;
	}


	public void setItems(Set<Item> items) {
		this.items = items;
	}


	public Float getTotal() {
		return total;
	}


	public Cart(Integer cartid, Set<Item> items, Float total) {
		super();
		Cartid = cartid;
		this.items = items;
		this.total = total;
	}


	@Override
	public String toString() {
		return "Cart [Cartid=" + Cartid + ", items=" + items + ", total=" + total + "]";
	}


	public void setTotal(Float total) {
		this.total = total;
	}
	
	
	 
	
	

}
