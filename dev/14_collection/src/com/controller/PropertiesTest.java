package com.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	 
	public static void main(String[] args) {
		//Properties객체 활용하기
		//key, value형식으로 저장됨
		//key : String / value : String
		Properties prop=new Properties();
		//값넣기
		//setProperty(key,value)
		prop.setProperty("email", "zzzzzzzz@naver.com");
		prop.setProperty("domain", "www.iei.or.kr");
		
		System.out.println(prop);
		//값 가져오기
		String v=prop.getProperty("email");
		System.out.println(v);
		
		//파일과 연동해서 처리가능 
		//특정파일에 properties객체가 가지고 있는 내용을 저장하는 매소드를 가지고 있음
		//properties, xml파일..
		//store() : 일반파일
		//storeToXML() : xml형식의 파일로 저장
		try {
			prop.store(new FileOutputStream("test.properties"),"myinfo");
			prop.storeToXML(new FileOutputStream("test.xml"), "");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		// properties외부파일과 손쉽게 연동이 되기 때문에...
		// 주로 환경설정에 대한 내용, 설정정보, 소프트웨어 설정...
		
		
		//외부에서 생성한 파일도 불러올 수 있음
		loadProperty();
		
	}
	
	public static void loadProperty() {
		Properties prop=new Properties();
		//외부파일에 내용을 불러오려면 
		//load() 매소드를 이용함
		try {
			prop.load(new FileInputStream("testData.properties"));
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			//xml파일 불러오기
			prop.loadFromXML(new FileInputStream("test.xml"));
			System.out.println(prop.getProperty("domain"));
			
			prop.list(System.out);//properties내용 전체를 한번에 확인할때 사용
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
