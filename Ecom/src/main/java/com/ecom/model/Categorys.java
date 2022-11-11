package com.ecom.model;




import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Categorys {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer catId;
	private String catname;
	private String ImgUrl;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "categorys")
	private List<Product> product=new ArrayList<Product>();
	
	
	public Integer getCatId() {
		return catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	public String getCatname() {
		return catname;
	}
	public void setCatname(String catname) {
		this.catname = catname;
	}
	public String getImgUrl() {
		return ImgUrl;
	}
	public void setImgUrl(String imgUrl) {
		ImgUrl = imgUrl;
	}
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Categorys [catId=" + catId + ", catname=" + catname + ", ImgUrl=" + ImgUrl + ", product=" + product
				+ "]";
	}
	
	
	
	

}
