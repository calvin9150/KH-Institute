package com.threadtest_controller;

public class AutoGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameThread bear =new GameThread(new GameCharacter("°õÅÊÀÌ", 1000));
		GameThread tiger =new GameThread(new GameCharacter("È£·©ÀÌ", 1000));
		GameThread lion =new GameThread(new GameCharacter("¶óÀÌ¾ğÅ·", 1000));
		GameThread skel =new GameThread(new GameCharacter("»Á´Ù±¸", 1000));
		bear.start();
		tiger.start();
		lion.start();
		skel.start();
	}

}
