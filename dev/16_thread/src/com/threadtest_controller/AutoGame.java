package com.threadtest_controller;

public class AutoGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameThread bear =new GameThread(new GameCharacter("������", 1000));
		GameThread tiger =new GameThread(new GameCharacter("ȣ����", 1000));
		GameThread lion =new GameThread(new GameCharacter("���̾�ŷ", 1000));
		GameThread skel =new GameThread(new GameCharacter("���ٱ�", 1000));
		bear.start();
		tiger.start();
		lion.start();
		skel.start();
	}

}
