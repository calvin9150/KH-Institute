package com.test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하시오.");
        String name = sc.nextLine();
        System.out.println("나이를 입력하시오.");
        int age = sc.nextInt();
        System.out.println("성별을 입력하시오.");
        sc.nextLine();
        String sex = sc.nextLine();
        System.out.println("키를 입력하시오.");
        double height = sc.nextDouble();
        System.out.println("주소를 입력하시오.");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.println("이름 : "+name+" 나이 : "+age+" 성별 : "+sex+" 키 : "+height+" 주소 : "+address+" 입니다.");
    }
}
