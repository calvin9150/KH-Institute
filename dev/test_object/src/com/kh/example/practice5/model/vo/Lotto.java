package com.kh.example.practice5.model.vo;

import java.util.*;

public class Lotto {
	private int[] lotto = new int[6];
	{
		
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
            
       		  	 // 중복 번호 제거
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	public Lotto() {};
	
	public void information() {
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
	
	
}
