package com.generic.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.generic.model.vo.Book;

public class BookDao {
	public static List myBooks;
	public static List<Book> books;
	
	static {
		myBooks = new ArrayList();
		books = new ArrayList();
		myBooks.add(new Book("자바의 정석", "남궁성", 35000));
		myBooks.add(new Book("자바 마스터", "곰탱이", 1000));
		myBooks.add(new Book("자바란 무엇인가", "자바신", 15000));
		books = new ArrayList(myBooks);
	}
}
