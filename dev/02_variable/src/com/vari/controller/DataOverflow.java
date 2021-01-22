package com.vari.controller;

public class DataOverflow {

    public static void main(String[] args){
        int bnum = 125;
        for(int i=0; i<300; i++){
            System.out.println(++bnum);
        }
    }
}
