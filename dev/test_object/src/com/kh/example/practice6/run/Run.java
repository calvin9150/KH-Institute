package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
	
	public static void main(String[] args) {
		
		Book book1 = new Book("������ ����", "�������ǻ�", "������佺");
		book1.inform();
		
		Book book2 = new Book("ȣ��", "�������ǻ�", "������佺", 30000, 5.5);
		book2.inform();
		
	}
}
