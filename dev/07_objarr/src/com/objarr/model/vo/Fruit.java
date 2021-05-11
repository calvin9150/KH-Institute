package com.objarr.model.vo;

public class Fruit {

	private String name;
	private String origin;
	private int price;
	private double weight;
	private String rating;
	
	public Fruit() {}
		
		public Fruit (String name, String origin, int price,
				double weight, String rating) {
			this.name = name;
			this.origin = origin;
			this.price = price;
			this.weight = weight;
			this.rating = rating;
		}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
		
	}
	public void setRating(String rating) {
		this.rating = rating;
		}
	public String getRating() {
		return rating;
	}
}
