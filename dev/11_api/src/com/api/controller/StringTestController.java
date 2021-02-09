package com.api.controller;

public class StringTestController {
	
	public static void main(String[] args) {
		//���ڿ�ó�� Ŭ������ ���� �˾ƺ���.
		//1. String Ŭ���� �ڹٿ��� �⺻�ڷ���ó�� ���ڿ��� ó���� �� �ִ� Ŭ����
		String str = "������";
		System.out.println(str);
		
		//�ּҰ� ���
		//String �� �Һ��� ������
		System.out.println(str.hashCode());
		str+=" �̷��ϴ�";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		//String Ŭ�������� �����ϴ� �޼��� �˾ƺ���
		//���־��� �޼����
		//1. concat() : ���ڿ��� �����ϰ� ��ȯ�ϴ� �޼���.
		String temp = str.concat(" �ʹ� �̷��ϴ�.");
		System.out.println(str+" : "+temp);
		
		//2. contains (Ȯ�ι��ڿ�) : ���ڿ��� Ư�� ���ڰ� ���Եƴ��� Ȯ���ϴ� �޼���
		// �Ű������� ���� ���ڿ��� �����̸� true
		System.out.println(temp.contains("������")); // true
	
		//3. indexOf() : �Ű������� ���ڿ��� ������ ���ڸ� ã�� �� ���ڿ��� �ε��� ��ȣ�� ��ȯ
		// ���� ������ -1�� ��ȯ, ���⵵ �ε��� ��ҷ� ����.
		System.out.println(temp.indexOf("�̷�"));
		//������ġ ���� ����
		System.out.println(temp.indexOf("�̷�", 4));
		
		temp = "�ȳ��ϼ�����";
		// 4. lastIndexOf() : ã�� ���ڿ� �߿��� ���� ������ ���� �ε����� ���
		System.out.println(temp.lastIndexOf("��"));
		
		//5. replace(��󹮰�, ��ü����) : Ư�������� �����ϴ� �޼���
		String change = temp.replace("��", "��");
		System.out.println(change);
		
		//6. split() : ���ڿ��� Ư�������ڿ� ���� ���еǾ��� ��, �� �����ڸ� �������� �迭 ���¸� ����� �ش�.
		temp = "�ڵ�,�౸,ķ��,Ŭ���̹�";
		String[] hobbies = temp.split(",");
		for(int i=0;i<hobbies.length;i++) {
			System.out.println(hobbies[i]);
		}
		
		//***������
		//forEach�� : �迭, List, Map, Set ���� �ڷḦ �ڵ����� �ݺ��Ͽ� �����͸� ��ȸ�� �� �ִ� �ݺ���
		//for( �迭�ڷ��� ���� : �迭 or List or Set or Map){����}
		for(String h : hobbies) {
			System.out.println(h);
		}
		
		//7. join(�ε��� ���̿� ���� ���ڿ�, ��� �迭) : �迭�� ���ڿ��� �������ִ� �޼���
		temp = "�ڵ�,�౸,ķ��,Ŭ���̹�";
		String aaa = String.join("~", hobbies);
		System.out.println(aaa); //�ڵ�~�౸~ķ��~Ŭ���̹�
		
		//8. subString() : ���ڿ��� Ư�� ��ġ�� �߶󳻴� ��
		//substring(����) / substring(����(����), ��(������))
		temp = "���� �� ���½ð�";
		System.out.println(temp.substring(5)); //���½ð�
		System.out.println(temp.substring(2,6)); // �� ��
		System.out.println(temp.substring(temp.indexOf("��"), temp.indexOf("��"))); //���½�
		
		//9. ��ҹ��� ��ȯ
		//toUpperCase(), toLowerCase()
		temp = "abcdefABC";
		System.out.println(temp.toUpperCase()); //ABCDEFABC
		System.out.println(temp.toLowerCase()); //abcdefabc
		
		//10. trim() : ���ڿ� �糡�� ������ ����
		temp = "   �ȳ�      ";
		System.out.println(temp.trim()); //�ȳ�
		
		//String.valueOf(���� or ���ͷ�)
		int a = 123;
		temp = String.valueOf(a);
		System.out.println(temp); //123
		
		
		//------------------------ StringBuffer
		//StringBuffer Ŭ����
		//�⺻�ڷ���ó�� �����ʰ� ��üó�� ����
		//�����ؼ� ����Ѵ�. �޼��带 �̿��ؼ� �����͸� ����.
		StringBuffer sb = new StringBuffer();
		//������ �ֱ�(�߰�)
		//append(����) : StringBuffer�� ������ �߰�����
		sb.append("�̾�ȣ");
		System.out.println(sb); //�̾�ȣ
		
		sb.insert(sb.indexOf("ȣ")+1, " ����� �ð��̴�");
		System.out.println(sb); // �̾�ȣ ����� �ð��̴�
		
		//setCharAt();
		sb.setCharAt(0, '��');
		System.out.println(sb); // ����ȣ ����� �ð��̴�)
		
		//String, StringBuffer ��ȯ
		String temp1 = new String(sb); // StringBuffer�� String Ÿ�� ������ ����
		temp1 = sb.toString(); // StringBuffer�� String Ÿ�� ������ ����
		StringBuffer sb1 = new StringBuffer(temp1); // String�� StringBuffer Ÿ�� ������ ����
		
	}	
}
