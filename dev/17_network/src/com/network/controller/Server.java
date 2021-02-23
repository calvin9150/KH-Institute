package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

	public static void main(String[] args) throws IOException{
		//1.port 설정
		int port = 9876;
		
		//ServerSocket 생성
		ServerSocket socket = new ServerSocket(port);
		while(true) {
			//클라이언트 요청 기다리기
			Socket client = socket.accept();
			
			//클라이언트와 연결되는 스트림 생성
			InputStream input = client.getInputStream();
			OutputStream out = client.getOutputStream();
			
			//보조스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter pw = new PrintWriter(out);
			
			while(true) {
				String msg = br.readLine();
				if(!msg.equals("exit")){
					System.out.println(client.getInetAddress()+" : "+msg);
					pw.println("전송완료\n");
					pw.flush();
				} else {
					System.out.println("접속을  종료합니다.");
					break;
				}
			}
			br.close();
			pw.close();
			client.close();
			
		}
	}

}
