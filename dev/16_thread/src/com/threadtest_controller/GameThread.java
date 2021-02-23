package com.threadtest_controller;

public class GameThread extends Thread{

	private GameCharacter gc;
	
	public GameThread() {
		// TODO Auto-generated constructor stub
	}

	public GameThread(GameCharacter gc) {
		super();
		this.gc = gc;
	}

	@Override
	public void run() {
		System.out.println("========="+gc.getName()+"님이 입장하셨습니다. ");

		while(true) {
			int damage = (int)(Math.random()*500)+1;
			int cho = (int)(Math.random()*2);
			switch(cho) {
			case 0 : System.out.println(damage+"만큼 공격을 받았다!");
					gc.setHp(gc.getHp()-damage);
					break;
			case 1 : System.out.println("공격 회피함");
					break;
					
			}
			System.out.println(gc.getName()+"님이"+gc.getHp()+"만큼 체력이 남았습니다.");
			try {
				sleep((int)(Math.random()*1000)+300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	
}
