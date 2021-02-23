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
		//1.port ����
		int port = 9876;
		
		//ServerSocket ����
		ServerSocket socket = new ServerSocket(port);
		while(true) {
			//Ŭ���̾�Ʈ ��û ��ٸ���
			Socket client = socket.accept();
			
			//Ŭ���̾�Ʈ�� ����Ǵ� ��Ʈ�� ����
			InputStream input = client.getInputStream();
			OutputStream out = client.getOutputStream();
			
			//������Ʈ��
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter pw = new PrintWriter(out);
			
			while(true) {
				String msg = br.readLine();
				if(!msg.equals("exit")){
					System.out.println(client.getInetAddress()+" : "+msg);
					pw.println("���ۿϷ�\n");
					pw.flush();
				} else {
					System.out.println("������  �����մϴ�.");
					break;
				}
			}
			br.close();
			pw.close();
			client.close();
			
		}
	}

}
