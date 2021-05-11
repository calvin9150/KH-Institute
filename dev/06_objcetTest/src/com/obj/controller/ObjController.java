package com.obj.controller;

import com.obj.model.vo.PublicTest;
//import com.obj.model.vo.DefaultTest;
import com.obj.model.vo.MemberVariable;

public class ObjController {

		public void accessObj() {
			//접근제한자에 따른 클래스 이용가능여부
			//클래스를 이용하기 위해서는 new연산자로 생성(인스턴스화) 해야한다.
			//new 클래스명() <- 클래스를 생성한 것.
			PublicTest pt = new PublicTest();
			
			//default 접근제한자 클래스 생성
			//DefaultTest dt = new DefaultTest();//에러
			
		}
		
		public void memberVari() {
			//멤버변수 활용 및 접근제한자 테스트
			MemberVariable mv = new MemberVariable();
			System.out.println(mv.name);
			System.out.println(mv.height);
			mv.game="starcraft";
			System.out.println(mv.game);
			
		}
	
}
