package com.network.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkTest {

	public static void main(String[] args) throws UnknownHostException{
		InetAddress localIp = InetAddress.getLocalHost();
		System.out.println(localIp.getHostAddress());
		InetAddress naver = InetAddress.getByName("www.naver.com");
		System.out.println(naver.getHostAddress());
		
	}

}
