package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			System.out.println("입력 메뉴입니다.");
		case 2 :
			System.out.println("수정 메뉴입니다.");
		case 3 :
			System.out.println("조회 메뉴입니다.");
		case 4 :
			System.out.println("삭제 메뉴입니다.");
		case 7 :
			System.out.println("프로그램이 종료됩니다");
		}
	}
	
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("양수만 입력해주세요.");
		} else if(num/2==0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다.");
		}
	}
	
	public void practice3() {
		System.out.print("국어점수 : ");
		int lang = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		int sum = lang+math+eng;
		double avg = sum/3;
		System.out.println("국어 : "+lang);
		System.out.println("수학 : "+math);
		System.out.println("영어 : "+eng);
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		if(avg>=60&&lang>=40&&math>=40&&eng>=40) {
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String season = "";
		switch (month) {
		case 12 :
		case 1 :
		case 2 :
			season = "겨울";
			System.out.println(month+"월은 "+season+"입니다.");
			break;
		case 3 :
		case 4 :
		case 5 :
			season = ("봄");
			System.out.println(month+"월은 "+season+"입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :
			season = ("여름");
			System.out.println(month+"월은 "+season+"입니다.");
			break;
		case 9 :
		case 10 :
		case 11 :
			season = ("가을");
			System.out.println(month+"월은 "+season+"입니다.");
			break;
		default :
			System.out.println(month+"은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice5() {
		String id = "myId";
		String pw = "myPassword12";
		String getId = sc.nextLine();
		String getPw = sc.nextLine();
		if(getId.equals(id)) {
			if(getPw.equals(pw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String user = sc.nextLine();
		switch (user) {
		case "관리자" :
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("관리자, 회원, 비회원 중 하나를 입력하세요.");
		}
	}
	
	public void practice7() {
		System.out.println("키(m)를 입력해 주세요");
		double height = sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요");
		int weight = sc.nextInt();
		double BMI = weight/(height*height);
		System.out.println("BMI 지수 : "+BMI);
		if(BMI>=30) {
			System.out.println("고도 비만");
		} else if (BMI>=25&&BMI<=30) {
			System.out.println("비만");
		} else if (BMI>=23&&BMI<=25) {
			System.out.println("과체중");
		} else if (BMI>=18.5&&BMI<=23) {
			System.out.println("정상체중");
		} else {
			System.out.println("저체중");
		}
	}
	
	public void practice8() {
        System.out.print("피연산자1 입력 : ");
        double x = sc.nextDouble();
        System.out.print("피연산자2 입력 : ");
        double y = sc.nextDouble();
        System.out.print("연산자(+,-,*,/,%)를 입력 : ");
        char operator = sc.next().charAt(0);
        if(x>0&&y>0) {
            System.out.print(x+""+operator+""+y+" = ");
        switch(operator) {
        	case '+' :
        		System.out.println(x+y);
        		break;
        	case '-' :
        	System.out.println(x-y);
        		break;
        	case '*' :
        		System.out.println(x*y);
        		break;
        	case '/' :
        		System.out.println(x/y);
        		break;
        	case '%' :
        		System.out.println(x%y);
        		break;
        	default :
        		System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
        	}
        } else {
        	System.out.println("양수를 입력해주세요.");
        }
	}
	
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble()*20/100;
		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextDouble()*30/100;
		System.out.print("과제 점수 : ");
		double task = sc.nextDouble()*30/100;
		System.out.print("출석 회수 : ");
		int attend = sc.nextInt();
		double total = mid+fin+task+attend;
		
		System.out.println("============결과============");
		System.out.println("중간 고사 점수(20) : "+mid);
		System.out.println("기말 고사 점수(30) : "+fin);
		System.out.println("과제 점수(30) : "+task);
		System.out.println("출석 점수(20) : "+attend*1f);
		System.out.println("총점 : "+total);
		
		if(attend>14&&total>=60) {
			System.out.println("Pass");
		} else if(attend>14){
			System.out.println("Fail [점수 미달]");
		} else if(total>=60) {
			System.out.println("[출석 회수 부족 ("+attend+"/20)]");
		}
	}
	
	public void practice10() {
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력"+"\n"+"2. 짝수/홀수"+"\n"+"3. 합격/불합격"+"\n"+"4. 계절"+"\n"+"5. 로그인"+"\n"+"6. 권한 확인"+"\n"+"7. BMI"+"\n"+"8. 계산기"+"\n"+"9. P/F");
		int pick = sc.nextInt();
		System.out.println("선택 : "+pick);
		switch(pick) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		}
	}
	
	public void practice11() {
		System.out.print("비밀번호 입력(1000~9999) : ");
		String pw = sc.nextLine();
		int pwInt = Integer.parseInt(pw);
		char pwArr[] = new char[4];
		if(pwInt<10000) {
			for(int i=0; i<=3; i++) {
				pwArr[i] = pw.charAt(i);
			}
			Loop1 :
			for(int i=0; i<=3; i++) {
				char temp = pwArr[i];
				Loop2 :
				for(int j=0; j<=3; j++) {
					if(i != j&&pwArr[i]==pwArr[j]) {
						System.out.println("중복 값 있음. ");
						break Loop1;
					}
				}
				if(i==3) {
					System.out.println("생성 성공");
				}
			}
			} else {
				System.out.println("자리 수 안 맞음.");
			}
	}

}
