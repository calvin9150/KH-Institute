package com.kh.example.practice4.model.vo;

import java.util.Scanner;

public class Student {
	
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {};
	
	public void information() {
		System.out.println(grade+classroom+name+height+gender);
	}
	
}
