package com.op.controller;

import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);

    public void calculator(){
        System.out.println("첫번째 숫자를 입력하시오.");
        Double num = sc.nextDouble();

        System.out.println("두번째 숫자를 입력하시오.");

        Double num2 = sc.nextDouble();

        double plus = num+num2;
        double division = num/num2;
        double multi = num*num2;
        double minus = num-num2;

        System.out.println(num+"+"+num2+"="+plus);
        System.out.println(num+"-"+num2+"="+minus);
        System.out.println(num+"/"+num2+"="+division);
        System.out.println(num+"*"+num2+"="+multi);
    }

}
