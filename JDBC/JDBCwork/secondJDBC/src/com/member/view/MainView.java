package com.member.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.member.controller.MemberController;
import com.member.model.vo.Member;

//view클래스는 사용자에게 화면을 출력해주는 역할을 하는 클래스
//화면에서 선택, data입력받고 controller에 서비스를 요청하는 기능
public class MainView {
	//이름으로 조회(일부조회가능)
	//아이디로 조회
	//회원등록하기 기능 구현하기.
	
	public void mainMenu() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("==== 회원관리 프로그램 v.1====");
			System.out.println("1. 전체회원조회하기");
			System.out.println("2. 이름으로 조회하기");//부분검색가능하게
			System.out.println("3. 아이디로 조회하기");//일치한자료만.
			System.out.println("4. 회원등록하기");
			System.out.println("5. 회원정보수정하기");//나이, 이메일, 전화번호, 주소
			System.out.println("6. 회원삭제하기");//삭제.
			System.out.println("7. 컬럼지정 검색하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.print("입력 : ");
			int cho=sc.nextInt();
			switch(cho) {//controller에 서비스를 요청해야함.
				case 1 : new MemberController().selectAll();break;
				case 2 : new MemberController().searchName();break;
				case 3 : break;
				case 4 : new MemberController().insertMember();break;
				case 5 : new MemberController().updateMember();break;
				case 6 : break;
				case 7 : new MemberController().searchColName();break;
				
				case 0 : System.out.println("프로그램을 종료합니다."); return;
			}
		}
	}
	
	
	public void printMembers(List<Member> list) {
		System.out.println("===== 회원 조회 결과 =====");
		//if(list!=null) {
		if(!list.isEmpty()){
			for(Member m : list) {
				System.out.println(m);
			}
		}else {
			System.out.println("조회한 결과가 없습니다!");
		}
		
		
	}
	
	
	public String inputData() {
		System.out.println("==== 조회할 이름 입력 ====");
		Scanner sc=new Scanner(System.in);
		System.out.print("입력 : ");
		return sc.nextLine();
	}

	
	public Member insertMember() {
		System.out.println("===== 회원등록 =====");
		Scanner sc=new Scanner(System.in);
		Member m=new Member();
		System.out.print("아이디 : ");
		m.setMemberId(sc.nextLine());
		System.out.print("패스워드 : ");
		m.setMemberPwd(sc.nextLine());
		System.out.print("이름 : ");
		m.setMemberName(sc.nextLine());
		System.out.print("성별(M/F) : ");
		m.setGender(sc.nextLine().toUpperCase());
		System.out.print("나이 : ");
		m.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("이메일 : ");
		m.setEmail(sc.nextLine());
		System.out.print("전화번호 : ");
		m.setPhone(sc.nextLine());
		System.out.print("주소 : ");
		m.setAddress(sc.nextLine());
		System.out.print("취미(,) : ");
		m.setHobby(sc.nextLine());
		
		return m;
	}
	
	
	public void printMsg(String msg) {
		System.out.println("========== 시스템 알림 ==========");
		System.out.print(msg);
		System.out.println("===============================");
		
	}
	
	
	public Map<String,String> inputColVal() {
		//column이름 검색할 내용 두개를 받아서
		Map<String,String> param=new HashMap();
		Scanner sc=new Scanner(System.in);
		System.out.println("===== 컬럼별로 검색하기 ====");
		System.out.print("컬럼명 : ");
		String col=sc.nextLine();
		param.put("col", col);
		//String 두개 반환!
		System.out.print("검색어 : ");
		param.put("val", sc.nextLine());
		
		return param;
		
	}
	
	
	public Member updateMember() {
		//나이, 이메일, 전화번호, 주소수정데이터 받기
		Scanner sc=new Scanner(System.in);
		System.out.println("===== 수정할 회원정보 입력 =====");
		Member m=new Member();
		System.out.print("수정할 회원 아이디 : ");
		m.setMemberId(sc.nextLine());
		System.out.print("수정할 나이 : ");
		m.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("수정할 이메일 : ");
		m.setEmail(sc.nextLine());
		System.out.print("수정할 전화번호 : ");
		m.setPhone(sc.nextLine());
		System.out.print("수정할 주소 : ");
		m.setAddress(sc.nextLine());
		
		return m;		
	}
	
	
}











