package com.ecom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categorys {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer catId;
	private String catname;
	private String ImgUrl;
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
	
	

}
