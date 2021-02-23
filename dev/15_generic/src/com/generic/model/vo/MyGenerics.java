package com.generic.model.vo;

public class MyGenerics<T, U> {
	private T temp;
	private U temp2;
	
	public MyGenerics() {
		// TODO Auto-generated constructor stub
	}

	public MyGenerics(T temp) {
		this.temp = temp;
	}

	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
	
	
	
}
