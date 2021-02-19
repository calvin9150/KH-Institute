package com.io.controller;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

public class FileController {

	public static void main(String[] args) {
		//File��ü�� �̿��غ���.
		//Ŭ������ �����ؼ� ����� ��
		//�������� �Ű������� ���+���ϸ� ����
		//���ϸ� -> ����Ʈ���(������Ʈ�� �ִ� ���)�� ������ ������
		//File f=new File("test1.txt");
		File f=new File("c:\\fileData.txt");
		//heap������ File��ü�� ������ ����.		
		
		//FileŬ������ �̿��ؼ� ���� �����ϱ�
		try {
			System.out.println(f.createNewFile());//���� �����Ǹ� true, �������������� false
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//������Ʈ �������� ������ ã��
		//System.out.println(FileController.class.getResource("/").getPath());
		String path=FileController.class.getResource("/").getPath();
		path=path.substring(0,path.lastIndexOf("bin"));
		System.out.println(path);
		
		File f2=new File(path+"testPath");
		try {
			//File f2=new File(URLDecoder.decode(path,"UTF-8")+"testPath.txt");
			f2.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//File��ü�� ������ ������ ������.
		File dir=new File("root/a"+File.separator+"football");//defualt������ ��������
		//������ ���� mkdir(), mkdirs()
		//mkdir() : ������ �Ѱ��� ������ ���� com/test/controller 
		//mkdirs() : ������ ��� ���� ���� com/test/controller
		//System.out.println(dir.mkdir());
		System.out.println(dir.mkdirs());
		
		//������ ����, ������ ����
		//delete()�żҵ� �̿�
		File del=new File("root");
		del.delete();
//		File[] delList=new File("root").listFiles();
//		for(int i=0;i<delList.length;i++) {
//			System.out.println(delList[i].getName());
//		}
//		for(File d : delList) {
//			d.delete();
//		}
		
		//createFile �޼ҵ带 �����
		//default��ο� test������ ����� test���� �ȿ� rclass������ �����ϴ� ��ɱ���
		createFile();
		
		//file�� ���� ������ ������ִ� �żҵ�
		System.out.println(f2.getName());//����||�����̸�
		System.out.println(dir.getName());
		System.out.println(f2.canExecute());//������������Ȯ��
		System.out.println(dir.canExecute());
		System.out.println(f2.canRead());//���� �� �ִ�?
		System.out.println(f2.canWrite());//������ �� �ִ�?
		System.out.println(f2.getParent());//�������
		File pa=f2.getParentFile();//�θ����� ���ϰ�ü�� ��ȯ
		System.out.println(pa.getName());
		System.out.println(f2.getAbsolutePath());//��ü ������
		System.out.println(f2.isHidden());//���������̴�?
		System.out.println(f2.length());//����ũ��
		System.out.println(new Date(f2.lastModified()));//������¥
		System.out.println(f2.exists());//�ִ�??
		if(f2.exists()) {
			System.out.println("�����ֳ�");
		}else {
			System.out.println("���Ͼ���!");
		}
		System.out.println(f2.isFile());//�����̴�?
		System.out.println(f2.isDirectory());//������?
		
		//������ ��ü ������ �������� �żҵ�
		File rootDir=new File("c:\\Users\\user2");
		String[] fileNames=rootDir.list();//user2������ �ִ� ��� ����/����
		//�̸��� String���� ������.
		for(String name : fileNames) {
			//System.out.println(name);
			File temp=new File(rootDir.getAbsoluteFile(),name);
			//new File(rootDir.getAbsoluteFile()+"/"+name);
			if(temp.isFile()) System.out.println(temp.getName());
		}
		
		File[] files=rootDir.listFiles();
		for(File temp : files) {
			if(temp.isFile()) System.out.println(temp.getName());
		}
		
		//FilenameFilter file12;
		
		System.out.println("===============lambda============");
		//files=rootDir.listFiles(new FilenameFilterImpl());
		
//		files=rootDir.listFiles(new FilenameFilter() {
//			@Override 
//			public boolean accept(File dir, String name) {
//				return new File(dir,name).isFile();
//			}
//		});
		files=rootDir.listFiles((File dir1, String name) 
								-> {
									String name1="dasdf";
									return new File(dir1,name).isFile();	
								});
		
		for(File temp : files) {
			System.out.println(temp.getName());
		}
		
		//������..........................
		
		
		
	}
	
	
	public static void createFile() {
		File dir=new File("test");
		dir.mkdir();
		System.out.println(dir.getName());
		File f=new File("test/rclass");
		try {
			f.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
