package com.common;

import com.model.vo.Food;

@FunctionalInterface//한개의 추상매소드만 가지고 있는 인터페이스다!
public interface TestLambda {
	interface Test222{
		
	}
	
	
	boolean test(Food f);	
	/*
	 * default int hoho() { return 10; };
	 */
	
}
