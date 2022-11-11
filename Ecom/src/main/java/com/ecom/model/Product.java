package com.ecom.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	private String name;
	private String img;
	private Integer marketPrice;
	private Integer sellPrice;
	private Integer Stock;
	
	@ManyToOne (cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
	@JoinColumn(name = "catId", referencedColumnName = "catId")
	private Categorys categorys;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Integer getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(Integer marketPrice) {
		this.marketPrice = marketPrice;
	}
	public Integer getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(Integer sellPrice) {
		this.sellPrice = sellPrice;
	}
	public Integer getStock() {
		return Stock;
	}
	public void setStock(Integer stock) {
		Stock = stock;
	}
	public Categorys getCategorys() {
		return categorys;
	}
	public void setCategorys(Categorys categorys) {
		this.categorys = categorys;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", img=" + img + ", marketPrice=" + marketPrice
				+ ", sellPrice=" + sellPrice + ", Stock=" + Stock + ", categorys=" + categorys + "]";
	}
	
	
	
	

}
