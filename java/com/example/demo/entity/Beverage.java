package com.example.demo.entity;

public class Beverage {

	private String name;
	private String id;
	private boolean isAlcholic;
	private Integer price;
	private String category;
	private boolean isAvailable;
	
	
	public Beverage() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Beverage(String name, String id, boolean isAlcholic, Integer price, String category, boolean isAvailable) {
		super();
		this.name = name;
		this.id = id;
		this.isAlcholic = isAlcholic;
		this.price = price;
		this.category = category;
		this.isAvailable = isAvailable;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public boolean isAlcholic() {
		return isAlcholic;
	}


	public void setAlcholic(boolean isAlcholic) {
		this.isAlcholic = isAlcholic;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
}
