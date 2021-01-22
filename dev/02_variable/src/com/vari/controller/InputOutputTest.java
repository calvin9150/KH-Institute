package com.vari.controller;

import java.util.Scanner;

public class InputOutputTest {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int num = 100;
        String name = "Jang";
        System.out.println(num);
        System.out.println(name);
        System.out.print(num);
        System.out.print(name);

        System.out.printf("%s %d %.2f\n", "Jang", 19, 171.9);


        String input = scan.nextLine();
        System.out.println(input);

        System.out.println("당신의 키는?");
        double getHeight = scan.nextDouble();
        System.out.println(getHeight);


    }
}
