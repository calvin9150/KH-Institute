package com.obj.model.vo;

public class PublicTest {
	//접근제한자가 public인 클래스
	
	DefaultTest dt = new DefaultTest();
	
	public void variableTest() {
		MemberVariable mv = new MemberVariable();
		mv.name="kim";
	}
}
