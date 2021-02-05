package com.kh.example.practice2.model.vo;

import java.util.*;

public class Product {
	Scanner sc = new Scanner(System.in);
	
	private String pName;
	private int price;
	private String brand;
	
	public Product() {};
	
	public void information() {
		this.pName = "";
		System.out.println(pName+price+brand);
	};
	
	
}
