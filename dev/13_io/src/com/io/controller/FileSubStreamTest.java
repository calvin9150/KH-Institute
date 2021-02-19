package com.io.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import com.io.model.vo.Person;

public class FileSubStreamTest {

	//���꽺Ʈ���� �̿��غ���.
	public void stringChangeOutput() {
		//FileOutputStream -> byte���� ���. �����͸� FileWriter��������.
		BufferedWriter fw=null;
		try {
			fw=new BufferedWriter(new OutputStreamWriter(System.out));
			//System.out.write
			fw.write("�̰͵� �ǳ�?");
			fw.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw !=null) fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void stringChangeInput() {
		//fileStream Ű����� �����͸� �޾ƿ��� ����
		//Scanner ����Ѱ� ����
		BufferedReader br=null;
		try {
			
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("�Է� : ");
			String data=br.readLine();//Ű����κ��� �Է°� �޾ƿ�
			System.out.println(data);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//BufferedReader
	//BufferedWriter�̿��ϱ�
	//������ ��� 
	public void bufferedWriterTest() {
		try(BufferedWriter bw
				=new BufferedWriter(new FileWriter("sample.txt"));){
			
			bw.write("������ ����� \n");
			bw.write("������ �ݿ���");
			bw.write("������ �����");
			bw.write("������ �Ͽ���");
			
			bw.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void bufferedReaderTest(){
		try(BufferedReader br=new BufferedReader(new FileReader("sample.txt"))){
			
			String data="";
			while((data=br.readLine())!=null) {
				//data=br.readLine();
				System.out.println(data);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//DataInputStream
	//DataOutputStream
	//�����͸� �ڷ����� ������ ���·� ����
	// �ڷ����� ������ ���°� ������
	//FileInputStream, FileOutputStream
	public void dataOutputStreamTest() {
		Scanner sc=new Scanner(System.in);
		try(DataOutputStream dis
				=new DataOutputStream(new FileOutputStream("member.dat"))){
			System.out.print("���̵� : ");
			dis.writeUTF(sc.nextLine());//���ڿ�Ÿ������
			System.out.print("�н����� : ");
			dis.writeUTF(sc.nextLine());
			System.out.print("���� : ");
			dis.writeChar(sc.next().charAt(0));
			System.out.print("���� : ");
			dis.writeInt(sc.nextInt());
			System.out.print("Ű : ");
			dis.writeDouble(sc.nextDouble());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void dataInputStreamTest() {
		try(DataInputStream dis
				=new DataInputStream(new FileInputStream("member.dat"))){
			//�ҷ��ö�... ����!
			String id=dis.readUTF();
			String pw=dis.readUTF();
			char gender=dis.readChar();
			int age=dis.readInt();
			double height=dis.readDouble();
			System.out.println(id+pw+gender+age+height);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//Person 3���� �Է¹޾� person.dat�� �����ϰ�
	//����� �����͸� Person�迭�� �����Ͽ� ����ϱ�
	public void savePerson() {
		Scanner sc=new Scanner(System.in);
		try(DataOutputStream dis
				=new DataOutputStream(new FileOutputStream("person.dat"))){
			System.out.println("=== ��������ϱ� ===");
			for(int i=0;i<3;i++) {
				System.out.print("�̸� : ");
				String id=sc.nextLine();
				System.out.print("���� : ");
				int age=sc.nextInt();
				System.out.print("���� : ");
				char gender=sc.next().charAt(0);
				sc.nextLine();
				////////////// �Է¹��� ������ ���Ͽ� �����ϱ� ///////////
				dis.writeUTF(id);
				dis.writeInt(age);
				dis.writeChar(gender);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadPerson() {
//		Person[] persons= {new Person(), new Person(),new Person()};
		Person[] persons= new Person[3];
		//0~2 : null
		
		try(DataInputStream dis
				=new DataInputStream(new FileInputStream("person.dat"))) {
//			for(Person p : persons) {
			
			for(int i=0;i<persons.length;i++) {
				persons[i]=new Person();
				persons[i].setName(dis.readUTF());
				persons[i].setAge(dis.readInt());
				persons[i].setGender(dis.readChar());
			}
			
			for(Person p : persons) {
				System.out.println(p);
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}











