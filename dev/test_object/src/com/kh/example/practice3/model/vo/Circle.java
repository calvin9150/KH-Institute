package com.kh.example.practice3.model.vo;

import java.awt.geom.Area;

public class Circle {

	private double PI = 3.14;
	private int radius = 1;
	private double size;
	private double area;
	
	public Circle() {};
	
	public void incrementRadius() {
		//������ 1���� �� ����, ���� ���

		this.radius += 1;
		getAreaOfCircle();
		getSizeOfCircle();
	}
	
	public void getAreaOfCircle() {
		//�����̱��ϱ�
		this.area = radius*radius*PI;
		System.out.println("���� ���� : "+area);
	}
	
	public void getSizeOfCircle() {
		//���ѷ����ϱ�
		this.size = 2*radius*PI;
		System.out.println("���� �ѷ� : "+size);
	}
	
}
