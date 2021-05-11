package com.objarr.model.vo;

public class Car {
	
	private String model;
	private int seat;
	private String company;
	private int price;
	private String color;
	
	public Car() {}
		public Car (String model, int seat, String company, int price, String color) {
			this.model = model;
			this.seat = seat;
			this.company = company;
			this.price = price;
			this.color = color;
		}
		
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public int getSeat() {
		return seat;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
}
