package com.generic.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.generic.model.dao.BookDao;
import com.generic.model.vo.Book;
import com.generic.model.vo.MyGenerics;

public class GenericController {

	public static void main(String[] args) {
		//제네릭 이용하기. <자료형>
		// 주로 Collection, Map을 이용할 때 사용.
		ArrayList<String> names = new ArrayList();
		names.add("곰탱이");
		names.add("호랭이");
		//컴파일 시점에 타입을 확인
//		names.add(10); // generic 이용 시 컴파일 전에 에러가 남. 이용안하면 컴파일 후 에러.
		
		for(Object n : names) {
			String s = (String)n;
			System.out.println(s.charAt(0));
		}
		
		List myBooks = BookDao.myBooks;
		for(Object o : myBooks) {
			Book b = (Book)o;
			System.out.println(b.getTitle()+" "+b.getPrice());
		}
		
		Set myBooksSet = new HashSet(myBooks);
		Iterator it = myBooks.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getTitle()+" "+book.getAuthor());
		}
		
		/*
		for(Book b : Bookset) {
			System.out.println(b.getAuthor()+" "+b.getAuthor());
			}
		*/
		
		HashMap<Integer, String> map = new HashMap();
		
		map.put(1, "볶음밥");
		map.put(2, "순대국");
		map.put(3, "초밥");
		
		Set<Integer> key = map.keySet();
		Iterator<Integer> keyIt = key.iterator();
		while(keyIt.hasNext()) {
			int temp = keyIt.next();
			System.out.println(map.get(temp).charAt(0));
		}
		
		//Map.Entry 클래스 이용
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		Iterator<Map.Entry<Integer, String>> mapIt = entry.iterator();
		while(mapIt.hasNext()) {
			Map.Entry<Integer, String> data = mapIt.next();
			System.out.println(data.getKey()+" "+data.getValue().charAt(0));
		}
		
		//클래스를 generic으로 설계
		MyGenerics obj = new MyGenerics();
		obj.setTemp("갈비탕");
		System.out.println(obj.getTemp());
		obj.setTemp(new Date());
		System.out.println(obj.getTemp());
		MyGenerics intObj = new MyGenerics();
		intObj.setTemp(123+"원");
		System.out.println(intObj.getTemp());
		MyGenerics<List<Book>, Integer> objobj = new MyGenerics();
		objobj.setTemp(myBooks);

	}
}
