package com.obj.run;

import com.obj.model.vo.ConstructorTest;

public class ConstructorMain {

	public static void main(String[] args) {

		ConstructorTest ct = new ConstructorTest();
		System.out.println(ct.nickName); 
		ConstructorTest ct2 = new ConstructorTest(19, "Gom", 300);
		System.out.println(ct2.age);
		
		
	}

}
