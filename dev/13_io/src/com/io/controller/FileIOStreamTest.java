package com.io.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.io.model.vo.Person;

public class FileIOStreamTest {

	public void saveFile() {
		//OutputStream
		//Stream은 반드시 반환 -> close()매소드를 사용
		//예외처리를 해줘야함. -> try ~ catch
		FileOutputStream out=null;
		try {
			out=new FileOutputStream("testPath.txt");
			String msg="lambda fight 123";
			//write() 매소드를 이용해서 파일전송
			byte[] data=msg.getBytes();
			out.write(data);
			out.write("abcdefg".getBytes());
			out.write("한글이다".getBytes());
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out!=null) out.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public void loadFile() {
		//InputStream
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("testPath.txt");
			//파일에 있는 데이터를 가져올때 read()매소드이용
			//byte로 가져오는대... 
			//int data=-1;//가져온 byte데이터는 보관하는 변수
			//inputStream에서 파일에 저장된 내용을 더이상
			//가져올 것이 없으면 -1 반환을 함 
//			while((data=fis.read())!=-1) {
//				System.out.println((char)data);
//			}
			byte[] temp=new byte[(int)new File("testPath.txt").length()];
			fis.read(temp);
			String data=new String(temp);
			System.out.println(data);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	//문자처리 기반의 스트림
	//Reader / Writer
	public void strSaveFile() {
		//FileWriter -> stream
		try(FileWriter out=new FileWriter("strData");){
			
			String str="오늘은 목요일 엄청 춥네요...ㅠㅠ";
			out.write(str);
			out.write("디게 추워요 코로나가 다시 심해지네요..ㅠ");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void strLoadFile() {
		
		try(FileReader fr=new FileReader("strData");){
				//BufferedReader br=new BufferedReader(fr);){
			
			int data=-1;
			String msg="";
			while((data=fr.read())!=-1) {
				msg+=(char)data;
			}
			System.out.println(msg);			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//간단한 메모장 만들기
	//시작을 함. 클라이언트한테 값을 입력을 받음 
	//그 입력값을 변수에 저장하고 exit입력전까지는 계속 입력을 받음 
	//exit라고 입력하면 파일에 저장
	//파일에 저장되 구문 출력
	
	//파일명을 입력받아 그 파일명으로 메세지를 저장할것
	
	public void messageSave() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==== 메모장 ====");
		String msg="";
		String total="";
		while(!msg.equals("exit")) {
			System.out.println("메세지 입력 : ");
			msg=sc.nextLine();
			total+=msg+"\n";
		}
		System.out.print("저장할 파일명 : ");
		try(FileWriter out=new FileWriter(sc.nextLine())) {
			out.write(total);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public void messageLoad() {
		
		String path=FileIOStreamTest.class.getResource("/").getPath();
		path=path.substring(0,path.lastIndexOf("bin"));
		File f=new File(path);
		String[] fileList=f.list();
		System.out.println("==== 저장된 메모장목록 ===");
		for(String name:fileList) {
			if(name.contains(".wb")) {
				System.out.println(name);
			}
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("불러올 파일명 : ");
		try(FileReader fr=new FileReader(sc.nextLine())){
			int data=-1;
			String totalString="";
			while((data=fr.read())!=-1) {
				totalString+=(char)data;
			}
			System.out.println("====== 저장된 내용 ======");
			System.out.println(totalString);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void dataSave() {
		Person[] persons=new Person[3];
		persons[0]=new Person("유병승",19,'남',180.5);
		persons[1]=new Person("유병승1",20,'여',181.5);
		persons[2]=new Person("유병승2",21,'남',182.5);
		
		try(FileWriter out=new FileWriter("person.dat")){
			for(Person p : persons) {
				out.write(p.getName()+",");
				out.write(String.valueOf(p.getAge())+",");
				out.write(p.getGender()+",");
				out.write(String.valueOf(p.getHeight())+"\n");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void dataLoad() {
		try(FileReader fr=new FileReader("person.dat")){
			int data=-1;
			String person="";
			while((data=fr.read())!=-1) {
				person+=(char)data;
			}
			System.out.println(person);
			String[] strPersons=person.split("\n");
			Person[] persons=new Person[3];
//			for(String ps : strPersons) {
			for(int i=0;i<persons.length;i++) {
				String[] p=strPersons[i].split(",");
				persons[i]=new Person(p[0],Integer.parseInt(p[1]),
					p[2].charAt(0),Double.parseDouble(p[3]));
			}
			for(Person p : persons) {
				System.out.println(p);
			}
//			Person p=new Person(temp[0],Integer.parseInt(temp[1]),
//					temp[2].charAt(0),Double.parseDouble(temp[3]));
			
			//System.out.println(p);
			
		}catch(IOException e) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	
}
