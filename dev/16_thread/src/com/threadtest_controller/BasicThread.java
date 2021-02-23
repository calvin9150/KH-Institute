package com.threadtest_controller;

public class BasicThread extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			System.out.println(i);
		}
	}
}
