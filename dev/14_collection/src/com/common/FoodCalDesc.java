package com.common;

import java.util.Comparator;

import com.model.vo.Food;

public class FoodCalDesc implements Comparator<Food>{

	@Override 
	public int compare(Food f1, Food f2) {
		
		return f2.getCalorie()-f1.getCalorie();
		
	}
	
}






