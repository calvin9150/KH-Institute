package com.kh.example.practice3.model.vo;

import java.awt.geom.Area;

public class Circle {

	private double PI = 3.14;
	private int radius = 1;
	private double size;
	private double area;
	
	public Circle() {};
	
	public void incrementRadius() {
		//반지름 1증가 후 지름, 넓이 출력

		this.radius += 1;
		getAreaOfCircle();
		getSizeOfCircle();
	}
	
	public void getAreaOfCircle() {
		//원넓이구하기
		this.area = radius*radius*PI;
		System.out.println("원의 넓이 : "+area);
	}
	
	public void getSizeOfCircle() {
		//원둘레구하기
		this.size = 2*radius*PI;
		System.out.println("원의 둘레 : "+size);
	}
	
}
