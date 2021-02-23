package com.generic.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.generic.model.dao.BookDao;
import com.generic.model.vo.Book;

public class FilterTest {
/*
	public static void main(String[] args) {

		List<Book> books = BookDao.books;
		//filter Àû¿ëÇÏ¿© ÀÌ¿ë
		List<Book> result = filter(books,(Book b) -> b.getPrice()>8000);
		System.out.println(result);
		
		List result2 = filter(Arrays.asList(new Integer[] {1,2,3,4,5}),(Integer i) -> i>3);
		
		List result3 = filterString(Arrays.asList(new String[] {"°õ","ÅÊ","ÀÌ"}, (String name)->name.charAt(0)=='°õ'));
	}

	public static List<Integer> filter(List<Integer> data, Predicate<Integer> filter){
		List<Integer> result = new ArrayList();
		for(Integer b : data) {
			if(filter.test(b)) {
				result.add(b);
			}
		}
		return result;
	}
	
	public static List<Book> filter(List<Book> data, Predicate<Book> filter){
		List<Book> result = new ArrayList();
		for(Book b : data) {
			if(filter.test(b)) {
				result.add(b);
			}
		}
		return result;
	}
	*/
}
