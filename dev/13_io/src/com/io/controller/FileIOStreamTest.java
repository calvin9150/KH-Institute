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
		//Stream�� �ݵ�� ��ȯ -> close()�żҵ带 ���
		//����ó���� �������. -> try ~ catch
		FileOutputStream out=null;
		try {
			out=new FileOutputStream("testPath.txt");
			String msg="lambda fight 123";
			//write() �żҵ带 �̿��ؼ� ��������
			byte[] data=msg.getBytes();
			out.write(data);
			out.write("abcdefg".getBytes());
			out.write("�ѱ��̴�".getBytes());
			
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
			//���Ͽ� �ִ� �����͸� �����ö� read()�żҵ��̿�
			//byte�� �������´�... 
			//int data=-1;//������ byte�����ʹ� �����ϴ� ����
			//inputStream���� ���Ͽ� ����� ������ ���̻�
			//������ ���� ������ -1 ��ȯ�� �� 
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
	
	//����ó�� ����� ��Ʈ��
	//Reader / Writer
	public void strSaveFile() {
		//FileWriter -> stream
		try(FileWriter out=new FileWriter("strData");){
			
			String str="������ ����� ��û ��׿�...�Ф�";
			out.write(str);
			out.write("��� �߿��� �ڷγ��� �ٽ� �������׿�..��");
			
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
	
	//������ �޸��� �����
	//������ ��. Ŭ���̾�Ʈ���� ���� �Է��� ���� 
	//�� �Է°��� ������ �����ϰ� exit�Է��������� ��� �Է��� ���� 
	//exit��� �Է��ϸ� ���Ͽ� ����
	//���Ͽ� ����� ���� ���
	
	//���ϸ��� �Է¹޾� �� ���ϸ����� �޼����� �����Ұ�
	
	public void messageSave() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==== �޸��� ====");
		String msg="";
		String total="";
		while(!msg.equals("exit")) {
			System.out.println("�޼��� �Է� : ");
			msg=sc.nextLine();
			total+=msg+"\n";
		}
		System.out.print("������ ���ϸ� : ");
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
		System.out.println("==== ����� �޸����� ===");
		for(String name:fileList) {
			if(name.contains(".wb")) {
				System.out.println(name);
			}
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("�ҷ��� ���ϸ� : ");
		try(FileReader fr=new FileReader(sc.nextLine())){
			int data=-1;
			String totalString="";
			while((data=fr.read())!=-1) {
				totalString+=(char)data;
			}
			System.out.println("====== ����� ���� ======");
			System.out.println(totalString);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void dataSave() {
		Person[] persons=new Person[3];
		persons[0]=new Person("������",19,'��',180.5);
		persons[1]=new Person("������1",20,'��',181.5);
		persons[2]=new Person("������2",21,'��',182.5);
		
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
