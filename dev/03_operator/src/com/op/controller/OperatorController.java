package com.op.controller;

import java.util.Scanner;
// 기능 제공용 클래스
public class OperatorController {

    Scanner sc = new Scanner(System.in);
    public void singleOp(){
        //부정연산
        // !값 or 명수명
        // !비교연산, 논리연산, 메소드() -> 보통은 이것들 사용
        boolean flag = true;
        System.out.println(flag);
        System.out.println(!flag);
    }

    public void calculator(){
        double num = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println(num+num2);
    }

    public void compareTest(){

        int age = 19;
        int age2 = 20;
        System.out.println(age==19);
        System.out.println(age==20);
        System.out.println(age==age2);
        // != 는 두 값이 다르면 true, == 는 두 값이 같아야 true
        System.out.println(age!=19); // false
        System.out.println("숫자를 입력해주세요.");
        int num = sc.nextInt();
        if(num==19) {
            System.out.println("19를 입력하셨습니다.");
        } else {
            System.out.println("19가 아닌 숫자를 입력하셨습니다.");}
    }

    public void compareTest2(){
        String id = sc.nextLine();
        int pw = sc.nextInt();
        System.out.println((id.equals("admin") && pw==1234));
    }

    public void compareTest3(){
        String str = sc.next();
        char gender = str.charAt(0);
        int num = sc.nextInt();

        System.out.println(num>=10 && num<=19 && gender=='W');
    }

    public void compareTest4(){
        System.out.println("사는 지역(도)를 입력하세요.");
        String address = sc.nextLine();
        System.out.println(address.equals("강원도")||address.equals("경기도"));
    }

    public void compareTest5(){
        System.out.println("사는 지역(도)를 입력하세요.");
        String address = sc.nextLine();
        System.out.println("나이를 입력하세요.");
        int age = sc.nextInt();
        System.out.println((address.equals("서울")||address.equals("광주"))&&(age>=30&&age<=39));
    }

    public void conditionalOp(){
        int age = sc.nextInt();
        System.out.println(age>19?"술 한 잔 할까?":"주스 한 잔 할까?");
    }

    public void conditionalOp2(){
        int num = sc.nextInt();
        System.out.println(num>100?"우와크다":"에이작다");
    }

    public void conditionalOp3(){
        int age = sc.nextInt();
        System.out.println(age<=19?"공부하세요":"돈 벌어야죠");
    }

    public void bitOp(){

    }

}

