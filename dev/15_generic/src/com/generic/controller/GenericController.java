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
		//���׸� �̿��ϱ�. <�ڷ���>
		// �ַ� Collection, Map�� �̿��� �� ���.
		ArrayList<String> names = new ArrayList();
		names.add("������");
		names.add("ȣ����");
		//������ ������ Ÿ���� Ȯ��
//		names.add(10); // generic �̿� �� ������ ���� ������ ��. �̿���ϸ� ������ �� ����.
		
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
		
		map.put(1, "������");
		map.put(2, "���뱹");
		map.put(3, "�ʹ�");
		
		Set<Integer> key = map.keySet();
		Iterator<Integer> keyIt = key.iterator();
		while(keyIt.hasNext()) {
			int temp = keyIt.next();
			System.out.println(map.get(temp).charAt(0));
		}
		
		//Map.Entry Ŭ���� �̿�
		Set<Map.Entry<Integer, String>> entry = map.entrySet();
		Iterator<Map.Entry<Integer, String>> mapIt = entry.iterator();
		while(mapIt.hasNext()) {
			Map.Entry<Integer, String> data = mapIt.next();
			System.out.println(data.getKey()+" "+data.getValue().charAt(0));
		}
		
		//Ŭ������ generic���� ����
		MyGenerics obj = new MyGenerics();
		obj.setTemp("������");
		System.out.println(obj.getTemp());
		obj.setTemp(new Date());
		System.out.println(obj.getTemp());
		MyGenerics intObj = new MyGenerics();
		intObj.setTemp(123+"��");
		System.out.println(intObj.getTemp());
		MyGenerics<List<Book>, Integer> objobj = new MyGenerics();
		objobj.setTemp(myBooks);

	}
}
