package com.threadtest_controller;

public class ThreadController {

	public static void main(String[] args) {
		
		Thread t = new Thread(new RunnableTest());
		t.start();
		
		BasicThread bt = new BasicThread();
		//������ �����Ϸ��� start()

		bt.start();
		
		for(int i=0; i<50; i++) {
			System.out.println("���� : "+i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
