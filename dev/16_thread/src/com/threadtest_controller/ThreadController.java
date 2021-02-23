package com.threadtest_controller;

public class ThreadController {

	public static void main(String[] args) {
		
		Thread t = new Thread(new RunnableTest());
		t.start();
		
		BasicThread bt = new BasicThread();
		//스레드 실행하려면 start()

		bt.start();
		
		for(int i=0; i<50; i++) {
			System.out.println("메인 : "+i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
