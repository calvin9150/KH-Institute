package com.common;

import java.util.Comparator;

import com.model.vo.Food;

public class FoodCalDsc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Food && o2 instanceof Food) {
			Food f1 = (Food)o1;
			Food f2 = (Food)o2;
			
			if(f1.getCalorie()<f2.getCalorie()) {
				return +1;
			} else if (f1.getCalorie()<f2.getCalorie()) {
				return -1;
			} else return 0;
		}
		return 0;
	}
	
}
