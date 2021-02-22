package com.model.vo;

import java.util.Date;
import java.util.Objects;

public class Food implements Comparable{

	private String name;
	private int price;
	private String category;
	private int calorie;
	private Date exp;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}

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
		return "Food [name=" + name + ", price=" + price + ", category=" + category + ", calorie=" + calorie + ", exp="
				+ exp + "]";
	}
	
	//객체의 동일성을 비교하기 위해 
	//equals오버라이딩처리를 해야함.
	//name, price, category 
	@Override
	public boolean equals(Object o) {
		if(o instanceof Food) {
			Food f=(Food)o;
			if(this.name.equals(f.name)
					&&this.price==f.price
					&&this.category.equals(f.category)) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,price,category);
	}
	

	@Override
	public int compareTo(Object f) {
		if(f instanceof Food) {
			Food temp=(Food)f;
			//return name.compareTo(temp.name);//오름차순으로 정렬
			return price-temp.price;
		}
		return 0;
	}
	
	
}








