package com.model.vo;

import java.util.Date;

public class Food {

	private String name;
	private int price;
	private String category;
	private int calorie;
	private Date exp;
	
	public Food() {}

	public Food(String name, int price, String category, int calorie, Date exp) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.calorie = calorie;
		this.exp = exp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public Date getExp() {
		return exp;
	}

	public void setExp(Date exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", category=" 
				+ category + ", calorie=" + calorie + ", exp="
				+ exp + "]";
	}
	
	//��ü�� ���ϼ� �񱳸� ���� equals �������̵� ó�� �ʿ�
	
	
//	@Override
//	public int hashCode() {
//		return Object.hash(name, price, category);
//	}
	
	
}
