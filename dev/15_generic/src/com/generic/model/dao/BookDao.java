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
		myBooks.add(new Book("�ڹ��� ����", "���ü�", 35000));
		myBooks.add(new Book("�ڹ� ������", "������", 1000));
		myBooks.add(new Book("�ڹٶ� �����ΰ�", "�ڹٽ�", 15000));
		books = new ArrayList(myBooks);
	}
}
