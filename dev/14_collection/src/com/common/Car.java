package com.common;

import java.util.Objects;

public class Car implements Comparable{

	private String name;
	private String color;
	private int price;
	private int person;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String color, int price, int person) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", price=" + price + ", person=" + person + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Car) {
			Car c = (Car)o;
			if(name.equals(c.name)
				&&color.equals(c.color)
				&&price==c.price) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,color,price);
	}
	
	@Override
	public int compareTo(Object o) {
		return price-((Car)o).getPrice();
	}
	
	
}
