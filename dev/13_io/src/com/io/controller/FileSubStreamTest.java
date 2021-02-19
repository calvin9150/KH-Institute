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

	//서브스트림을 이용해보자.
	public void stringChangeOutput() {
		//FileOutputStream -> byte단위 통신. 데이터를 FileWriter변경해줌.
		BufferedWriter fw=null;
		try {
			fw=new BufferedWriter(new OutputStreamWriter(System.out));
			//System.out.write
			fw.write("이것도 되네?");
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
		//fileStream 키보드로 데이터를 받아오는 로직
		//Scanner 비슷한거 구현
		BufferedReader br=null;
		try {
			
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("입력 : ");
			String data=br.readLine();//키보드로부터 입력값 받아옴
			System.out.println(data);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//BufferedReader
	//BufferedWriter이용하기
	//성능이 향상 
	public void bufferedWriterTest() {
		try(BufferedWriter bw
				=new BufferedWriter(new FileWriter("sample.txt"));){
			
			bw.write("오늘은 목요일 \n");
			bw.write("오늘은 금요일");
			bw.write("오늘은 토요일");
			bw.write("오늘은 일요일");
			
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
	//데이터를 자료형을 유지한 상태로 저장
	// 자료형을 유지한 상태고 가져옴
	//FileInputStream, FileOutputStream
	public void dataOutputStreamTest() {
		Scanner sc=new Scanner(System.in);
		try(DataOutputStream dis
				=new DataOutputStream(new FileOutputStream("member.dat"))){
			System.out.print("아이디 : ");
			dis.writeUTF(sc.nextLine());//문자열타입저장
			System.out.print("패스워드 : ");
			dis.writeUTF(sc.nextLine());
			System.out.print("성별 : ");
			dis.writeChar(sc.next().charAt(0));
			System.out.print("나이 : ");
			dis.writeInt(sc.nextInt());
			System.out.print("키 : ");
			dis.writeDouble(sc.nextDouble());
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void dataInputStreamTest() {
		try(DataInputStream dis
				=new DataInputStream(new FileInputStream("member.dat"))){
			//불러올때... 주의!
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
	
	
	//Person 3개를 입력받아 person.dat에 저장하고
	//저장된 데이터를 Person배열에 저장하여 출력하기
	public void savePerson() {
		Scanner sc=new Scanner(System.in);
		try(DataOutputStream dis
				=new DataOutputStream(new FileOutputStream("person.dat"))){
			System.out.println("=== 사람저장하기 ===");
			for(int i=0;i<3;i++) {
				System.out.print("이름 : ");
				String id=sc.nextLine();
				System.out.print("나이 : ");
				int age=sc.nextInt();
				System.out.print("성별 : ");
				char gender=sc.next().charAt(0);
				sc.nextLine();
				////////////// 입력받은 데이터 파일에 저장하기 ///////////
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











