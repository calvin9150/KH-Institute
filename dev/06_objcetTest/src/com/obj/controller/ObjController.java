package com.obj.controller;

import com.obj.model.vo.PublicTest;
//import com.obj.model.vo.DefaultTest;
import com.obj.model.vo.MemberVariable;

public class ObjController {

		public void accessObj() {
			//���������ڿ� ���� Ŭ���� �̿밡�ɿ���
			//Ŭ������ �̿��ϱ� ���ؼ��� new�����ڷ� ����(�ν��Ͻ�ȭ) �ؾ��Ѵ�.
			//new Ŭ������() <- Ŭ������ ������ ��.
			PublicTest pt = new PublicTest();
			
			//default ���������� Ŭ���� ����
			//DefaultTest dt = new DefaultTest();//����
			
		}
		
		public void memberVari() {
			//������� Ȱ�� �� ���������� �׽�Ʈ
			MemberVariable mv = new MemberVariable();
			System.out.println(mv.name);
			System.out.println(mv.height);
			mv.game="starcraft";
			System.out.println(mv.game);
			
		}
	
}
