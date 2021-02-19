package com.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.model.vo.Food;

public class ListController {
	public static void main(String[] args) {
		//ArrayList클래스 이용하기
		//배열과 동일한 저장박식을 가지며, 배열의 단점을 보완한 자료구조형태
		//ArrayList는 클래스로 생성해서 이용.
		//클래스 생성된 객체의 메서드를 이용해서 관리를 한다.
		ArrayList list = new ArrayList(); // default로 10개 공간 확보
		//list 객체를 10개 보관할 수 있는 공간 확보 -> 배열구조로 index에 의해 관리됨
		ArrayList list2 = new ArrayList(20); // 20개 공간 확보
		//내부 저장소는 Object[]로 되어있다.
		
		//ArrayList List인터페이스 Collection 인터페이스 구현
		//List 변수, Collection 변수에 대입될 수 있다.
		List l = new ArrayList();
		Collection c = new ArrayList();
		
		//ArrayList에 객체 저장하기
		list.add(true); 
		list.add(18); // true, 18은 기본 자료형인데 객체안에 어떻게 들어가나? -> 래퍼클래스
		list.add("Gom");
		list.add(new Date());
		System.out.println(list); //[true, 18, Gom, Fri Feb 19 20:10:19 KST 2021] 
		//ㄴ toString 처리 알아서 되어있음
		System.out.println(list.size());
		
		//ArrayList는 특정객체를 관리한다.
		//학생들. Student클래스 보관
		ArrayList foods = new ArrayList();
		foods.add(new Food("순대국", 7000, "국밥", 1000, null));
		foods.add(new Food("감자전", 10000, "전", 600, 
				new Date(new GregorianCalendar(2021,02,22).getTimeInMillis())));
		foods.add(new Food("계란초밥", 1000, "초밥", 200, null));
		
		System.out.println(foods);
		
		/*
		Food f = (Food)foods.get(0);
		System.out.println(f.getName()+" "+f.getPrice());
		System.out.println(((Food)foods.get(1)).getName()+" "+((Food)foods.get(1)).getPrice());
		for(int i=0; i<foods.size(); i++) {
			Food temp = (Food)foods.get(i);
			System.out.println(temp.getName()+ " "+temp.getPrice());
		}
		*/
		
		for(Object f1 : foods) {
			Food temp = (Food)f1;
			System.out.println(temp.getName()+" "+temp.getPrice());
		}
		
		//음식 중 칼로리가 500이상인 음식 출력
		for(int i=0; i<foods.size(); i++) {
			Food t = (Food)foods.get(i);
			if(t.getCalorie()>=500){
				System.out.println(t.getName());
			}
		}
		//ArrayList의 데이터 삭제하기
		//remove() 메서드 사용
		// 인덱스 이용해서 삭제 or 동일객체 이용해서 삭제
			foods.remove(2); // 계란초밥 삭제
		
		
		
		//ArrayList 에 있는 값 수정
		//set() 메서드 이용
		foods.set(1, new Food("라면", 1000, "면", 500, null)); // 감자전 -> 라면 수정
		System.out.println(foods);
		//원하는 위치에 값 추가
		foods.add(0, new Food("피자", 20000, "양식", 2300, null));
		System.out.println(foods);
		
		//list 모든 값 삭제
		list.clear();
		System.out.println(list);
		
		//추가로 유용한 메서드
		//list에 값이 있는지 확인 : contains()
		//list에 저장된 값이 있는지 확인 : isEmpty()
		if(!foods.isEmpty()) {
			System.out.println("음식이 있어요");
		}
		//indexOf(객체) : 매개변수와 일치하는 값의 인덱스번호 반환
		//toArray() : list에 저장된 객체를 Object배열로 반환해주는 메서드
		Object[] objFood = foods.toArray();
		for(int i=0; i<objFood.length; i++) {
//			System.out.println(objFood[i]);
		}
		//list는 중복데이터도 저장가능
		foods.add(new Food("라면", 1000, "면", 500, null));
		foods.add(new Food("라면", 1000, "면", 500, null));
		foods.add(new Food("라면", 1000, "면", 500, null));
		foods.add(new Food("라면", 1000, "면", 500, null));
		foods.add(new Food("라면", 1000, "면", 500, null));
		foods.add(new Food("라면", 1000, "면", 500, null));
		for(int i=0; i<foods.size(); i++) {
			System.out.println(foods.get(i));
		}
		//배열 정렬하기
		ArrayList numbers = new ArrayList();
		for(int i=0; i<10;i++) {
			numbers.add((int)(Math.random()*10));
		}
		Collections.sort(numbers);
		System.out.println(numbers);
	}
}
