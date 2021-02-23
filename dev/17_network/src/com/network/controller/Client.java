package com.network.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Client {

	public static void main(String[] args) throws IOException {
		//1.������Ʈ
		//2.����ip����
		String ip = "192.168.0.16";
		int port = 9876;
		//���� ����
		Socket server = new Socket(ip, port);
		
		//null�̸� ������ �ȵȰŴ�
		if(server!=null) {
			InputStream input = server.getInputStream();
			OutputStream out = server.getOutputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			PrintWriter pw = new PrintWriter(out);
			Scanner sc = new Scanner(System.in);
			
			do {
				System.out.println("���� �޼��� : ");
				String msg = sc.nextLine();
				pw.print(msg+"\n");
				pw.flush();
				if(msg.equals("exit")) {
					break;
				}
				//������ ���� ���� �ޱ�
				String response = br.readLine();
				System.out.println(response);
			}while(true);
			br.close();
			pw.close();
			sc.close();
			server.close();
		}
	}

}
