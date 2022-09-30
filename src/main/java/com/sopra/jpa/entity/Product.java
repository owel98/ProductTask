package com.sopra.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
	@Id
	private int prodId;
	private String prodName;
	private String prodCatg;
	private double prodPrice;
	
	public Product(int prodId, String prodName, String prodCatg, double prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCatg = prodCatg;
		this.prodPrice = prodPrice;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdCatg() {
		return prodCatg;
	}
	public void setProdCatg(String prodCatg) {
		this.prodCatg = prodCatg;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodCatg=" + prodCatg + ", prodPrice="
				+ prodPrice + "]";
	}
	

}
