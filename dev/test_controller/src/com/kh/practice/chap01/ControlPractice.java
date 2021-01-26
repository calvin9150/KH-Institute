package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			System.out.println("�Է� �޴��Դϴ�.");
		case 2 :
			System.out.println("���� �޴��Դϴ�.");
		case 3 :
			System.out.println("��ȸ �޴��Դϴ�.");
		case 4 :
			System.out.println("���� �޴��Դϴ�.");
		case 7 :
			System.out.println("���α׷��� ����˴ϴ�");
		}
	}
	
	public void practice2() {
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("����� �Է����ּ���.");
		} else if(num/2==0) {
			System.out.println("¦����.");
		} else {
			System.out.println("Ȧ����.");
		}
	}
	
	public void practice3() {
		System.out.print("�������� : ");
		int lang = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		int sum = lang+math+eng;
		double avg = sum/3;
		System.out.println("���� : "+lang);
		System.out.println("���� : "+math);
		System.out.println("���� : "+eng);
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);
		if(avg>=60&&lang>=40&&math>=40&&eng>=40) {
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		String season = "";
		switch (month) {
		case 12 :
		case 1 :
		case 2 :
			season = "�ܿ�";
			System.out.println(month+"���� "+season+"�Դϴ�.");
			break;
		case 3 :
		case 4 :
		case 5 :
			season = ("��");
			System.out.println(month+"���� "+season+"�Դϴ�.");
			break;
		case 6 :
		case 7 :
		case 8 :
			season = ("����");
			System.out.println(month+"���� "+season+"�Դϴ�.");
			break;
		case 9 :
		case 10 :
		case 11 :
			season = ("����");
			System.out.println(month+"���� "+season+"�Դϴ�.");
			break;
		default :
			System.out.println(month+"�� �߸� �Էµ� ���Դϴ�.");
		}
	}
	
	public void practice5() {
		String id = "myId";
		String pw = "myPassword12";
		String getId = sc.nextLine();
		String getPw = sc.nextLine();
		if(getId.equals(id)) {
			if(getPw.equals(pw)) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void practice6() {
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String user = sc.nextLine();
		switch (user) {
		case "������" :
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "ȸ��":
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "��ȸ��":
			System.out.println("�Խñ� ��ȸ");
			break;
		default:
			System.out.println("������, ȸ��, ��ȸ�� �� �ϳ��� �Է��ϼ���.");
		}
	}
	
	public void practice7() {
		System.out.println("Ű(m)�� �Է��� �ּ���");
		double height = sc.nextDouble();
		System.out.println("������(kg)�� �Է��� �ּ���");
		int weight = sc.nextInt();
		double BMI = weight/(height*height);
		System.out.println("BMI ���� : "+BMI);
		if(BMI>=30) {
			System.out.println("�� ��");
		} else if (BMI>=25&&BMI<=30) {
			System.out.println("��");
		} else if (BMI>=23&&BMI<=25) {
			System.out.println("��ü��");
		} else if (BMI>=18.5&&BMI<=23) {
			System.out.println("����ü��");
		} else {
			System.out.println("��ü��");
		}
	}
	
	public void practice8() {
        System.out.print("�ǿ�����1 �Է� : ");
        double x = sc.nextDouble();
        System.out.print("�ǿ�����2 �Է� : ");
        double y = sc.nextDouble();
        System.out.print("������(+,-,*,/,%)�� �Է� : ");
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
        		System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
        	}
        } else {
        	System.out.println("����� �Է����ּ���.");
        }
	}
	
	public void practice9() {
		System.out.print("�߰� ��� ���� : ");
		double mid = sc.nextDouble()*20/100;
		System.out.print("�⸻ ��� ���� : ");
		double fin = sc.nextDouble()*30/100;
		System.out.print("���� ���� : ");
		double task = sc.nextDouble()*30/100;
		System.out.print("�⼮ ȸ�� : ");
		int attend = sc.nextInt();
		double total = mid+fin+task+attend;
		
		System.out.println("============���============");
		System.out.println("�߰� ��� ����(20) : "+mid);
		System.out.println("�⸻ ��� ����(30) : "+fin);
		System.out.println("���� ����(30) : "+task);
		System.out.println("�⼮ ����(20) : "+attend*1f);
		System.out.println("���� : "+total);
		
		if(attend>14&&total>=60) {
			System.out.println("Pass");
		} else if(attend>14){
			System.out.println("Fail [���� �̴�]");
		} else if(total>=60) {
			System.out.println("[�⼮ ȸ�� ���� ("+attend+"/20)]");
		}
	}
	
	public void practice10() {
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���"+"\n"+"2. ¦��/Ȧ��"+"\n"+"3. �հ�/���հ�"+"\n"+"4. ����"+"\n"+"5. �α���"+"\n"+"6. ���� Ȯ��"+"\n"+"7. BMI"+"\n"+"8. ����"+"\n"+"9. P/F");
		int pick = sc.nextInt();
		System.out.println("���� : "+pick);
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
		System.out.print("��й�ȣ �Է�(1000~9999) : ");
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
						System.out.println("�ߺ� �� ����. ");
						break Loop1;
					}
				}
				if(i==3) {
					System.out.println("���� ����");
				}
			}
			} else {
				System.out.println("�ڸ� �� �� ����.");
			}
	}

}
