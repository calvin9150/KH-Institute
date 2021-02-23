package com.threadtest_controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RunnableTest implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<50; i++) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ hh:mm:ss");
			System.out.println(sdf.format(new Date()));
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
