package com.common;

import java.util.Comparator;

public class IntegerOrderDesc implements Comparator<Integer>{

	@Override 
	public int compare(Integer i, Integer i2) {
		return i2-i;//내림차순정렬
	}
	
}
