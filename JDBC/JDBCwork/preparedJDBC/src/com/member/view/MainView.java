package com.member.view;

import java.util.List;
import java.util.Scanner;

import com.member.controller.MemberController;
import com.member.model.vo.Member;

public class MainView {

	public void mainMenu() {
		MemberController mc = new MemberController();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("========== ȸ�� ���� ���α׷� =========");
			System.out.println("1. ��üȸ�� ��ȸ");
			System.out.println("2. �̸����� ��ȸ");
			System.out.println("3. ���̵�� ��ȸ");
			System.out.println("4. ȸ�����");
			System.out.println("5. ȸ������ ����");
			System.out.println("6. ȸ������");
			System.out.println("0. ����");
			
			int cho = sc.nextInt();
			
			switch(cho) {
			case 1 : mc.selectAll(); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : break;
			case 0 : System.out.println("���α׷��� ����...."); return;
			}
		}
	}
	
	public void printMembers(List<Member> list) {
		System.out.println("----- ȸ�� ��ȸ ��� -----");
		if(!list.isEmpty()) {
			for(Member data : list) {
				System.out.println(data);
			}
		} else {
			System.out.println("��ȸ�� ����� �����ϴ�.");
		}

	}
	
}
