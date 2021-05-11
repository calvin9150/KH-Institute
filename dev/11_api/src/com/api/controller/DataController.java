package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.*;

public class DataController {

	public DataController() {
		
		//Calendar 클래스는 추상클래스로 직접생성 불가능
		//Calendar의 getInstance()메서드를 이용한다.
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		//년월일 출력하려면 get메서드 이용하여 각각 가져와야함
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)); // 2월이면 1이 뜨는데, 컴터에서 월을 0부터 표시하기 때문
		System.out.println(c.get(Calendar.MONTH)+1); 
		System.out.println(c.get(Calendar.DATE));
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		
		System.out.println(year+"년"+month+"월"+hour+"시"+minute+"분");
		
		//Calendar를 SimpleDateFormat 으로 변경
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		String d = sdf2.format(new Date(c.getTimeInMillis()));
		System.out.println(d);
		
		//내가 원하는 날짜로 변경하기
		//set메서드를 이용
		c.set(Calendar.YEAR, 1993);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.DATE, 26);
		
		String e = sdf2.format(new Date(c.getTimeInMillis()));
		System.out.println(e);
		
		//GregorianCalender
		//생성자를 이용해 날짜 생성이 가능, 매개변수 있는 생성자 이용하면 년~초까지 초기화 가능
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);// java.util.GregorianCalendar[time=1613462815377,areFieldsSet=true,a불라불라
		System.out.println(gc.get(Calendar.YEAR));
		String d1 = sdf2.format(gc.getTimeInMillis());
		System.out.println(d1);
		
		c = new GregorianCalendar(2002, 6-1, 15);
		String d2 = sdf2.format(new Date(c.getTimeInMillis()));
		System.out.println(d2); // 2002년 06월 15일
		
		String bd = "2222-01-11";
		String[] temp = bd.split("-");
		for(String day1:temp) {
			System.out.println(day1);
		}
		
		
	}

}
