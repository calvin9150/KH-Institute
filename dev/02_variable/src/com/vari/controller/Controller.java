package com.vari.controller;

import java.util.Scanner;
//기능제공용 클래스
public class Controller {

    public void test(){
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하시오.");
        String name = sc.nextLine();
        System.out.println("나이를 입력하시오.");
        int age = sc.nextInt();
        System.out.println("성별(M or F)을 입력하시오.");
        char sex = sc.next().charAt(0);
        System.out.println("키를 입력하시오.");
        double height = sc.nextDouble();
        System.out.println("주소를 입력하시오.");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.println("이름 : "+name+" 나이 : "+age+" 성별 : "+sex+" 키 : "+height+" 주소 : "+address+" 입니다.");
    }

}
