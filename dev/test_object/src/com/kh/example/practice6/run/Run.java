package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	
	public static void main(String[] args) {
		
		Book book1 = new Book("반지의 제왕", "대흥출판사", "빌보배긴스");
		book1.inform();
		
		Book book2 = new Book("호빗", "대흥출판사", "빌보배긴스", 30000, 5.5);
		book2.inform();
		
	}
}
