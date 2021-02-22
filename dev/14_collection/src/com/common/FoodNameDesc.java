package com.common;

import java.util.Comparator;

import com.model.vo.Food;

public class FoodNameDesc implements Comparator<Food> {

	@Override
	public int compare(Food o1, Food o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}

	
	
}
