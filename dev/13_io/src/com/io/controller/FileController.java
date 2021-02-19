package com.io.controller;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;

public class FileController {

	public static void main(String[] args) {
		//File객체를 이용해보자.
		//클래스로 생성해서 사용을 함
		//생성자의 매개변수에 경로+파일명 대입
		//파일명 -> 디폴트경로(프로젝트가 있는 경로)에 파일이 지정된
		//File f=new File("test1.txt");
		File f=new File("c:\\fileData.txt");
		//heap영역에 File객체가 생성된 상태.		
		
		//File클래스를 이용해서 파일 생성하기
		try {
			System.out.println(f.createNewFile());//파일 생성되면 true, 생성되지않으면 false
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//프로젝트 기준으로 절대경로 찾기
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
		
		//File객체로 폴더도 생성이 가능함.
		File dir=new File("root/a"+File.separator+"football");//defualt폴더에 폴더생성
		//폴더를 생성 mkdir(), mkdirs()
		//mkdir() : 폴더를 한개만 생성이 가능 com/test/controller 
		//mkdirs() : 지정되 모든 폴더 생성 com/test/controller
		//System.out.println(dir.mkdir());
		System.out.println(dir.mkdirs());
		
		//생성된 폴더, 파일을 삭제
		//delete()매소드 이용
		File del=new File("root");
		del.delete();
//		File[] delList=new File("root").listFiles();
//		for(int i=0;i<delList.length;i++) {
//			System.out.println(delList[i].getName());
//		}
//		for(File d : delList) {
//			d.delete();
//		}
		
		//createFile 메소드를 만들어
		//default경로에 test폴더를 만들고 test폴더 안에 rclass파일을 생성하는 기능구현
		createFile();
		
		//file에 대한 정보를 출력해주는 매소드
		System.out.println(f2.getName());//파일||폴더이름
		System.out.println(dir.getName());
		System.out.println(f2.canExecute());//실행파일인지확인
		System.out.println(dir.canExecute());
		System.out.println(f2.canRead());//읽을 수 있니?
		System.out.println(f2.canWrite());//수정할 수 있니?
		System.out.println(f2.getParent());//상위경로
		File pa=f2.getParentFile();//부모폴더 파일객체로 반환
		System.out.println(pa.getName());
		System.out.println(f2.getAbsolutePath());//전체 절대경로
		System.out.println(f2.isHidden());//숨긴파일이니?
		System.out.println(f2.length());//파일크기
		System.out.println(new Date(f2.lastModified()));//수정날짜
		System.out.println(f2.exists());//있니??
		if(f2.exists()) {
			System.out.println("파일있네");
		}else {
			System.out.println("파일없네!");
		}
		System.out.println(f2.isFile());//파일이니?
		System.out.println(f2.isDirectory());//폴더니?
		
		//폴더에 전체 파일을 가져오는 매소드
		File rootDir=new File("c:\\Users\\user2");
		String[] fileNames=rootDir.list();//user2폴더에 있는 모든 파일/폴더
		//이름만 String으로 가져옴.
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
		
		//망했음..........................
		
		
		
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
