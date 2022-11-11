package com.ecom.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Cart {
	
	private Integer cartid;
	
	@OneToOne(mappedBy = "userid")
	private User user;
	
	@ManyToOne
	private List<ProductDto> product=new ArrayList<ProductDto>();
	

}
