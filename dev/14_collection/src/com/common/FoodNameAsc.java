package com.common;

import java.util.Comparator;

import com.model.vo.Food;

public class FoodNameAsc implements Comparator<Food> {

	@Override
	public int compare(Food o1, Food o2) {
		
		return o1.compareTo(o2);
		
	}

}
