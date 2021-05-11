package com.api.controller;

import java.text.SimpleDateFormat;
import java.util.*;

public class DataController {

	public DataController() {
		
		//Calendar Ŭ������ �߻�Ŭ������ �������� �Ұ���
		//Calendar�� getInstance()�޼��带 �̿��Ѵ�.
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		//����� ����Ϸ��� get�޼��� �̿��Ͽ� ���� �����;���
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)); // 2���̸� 1�� �ߴµ�, ���Ϳ��� ���� 0���� ǥ���ϱ� ����
		System.out.println(c.get(Calendar.MONTH)+1); 
		System.out.println(c.get(Calendar.DATE));
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		
		System.out.println(year+"��"+month+"��"+hour+"��"+minute+"��");
		
		//Calendar�� SimpleDateFormat ���� ����
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss");
		String d = sdf2.format(new Date(c.getTimeInMillis()));
		System.out.println(d);
		
		//���� ���ϴ� ��¥�� �����ϱ�
		//set�޼��带 �̿�
		c.set(Calendar.YEAR, 1993);
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.DATE, 26);
		
		String e = sdf2.format(new Date(c.getTimeInMillis()));
		System.out.println(e);
		
		//GregorianCalender
		//�����ڸ� �̿��� ��¥ ������ ����, �Ű����� �ִ� ������ �̿��ϸ� ��~�ʱ��� �ʱ�ȭ ����
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);// java.util.GregorianCalendar[time=1613462815377,areFieldsSet=true,a�Ҷ�Ҷ�
		System.out.println(gc.get(Calendar.YEAR));
		String d1 = sdf2.format(gc.getTimeInMillis());
		System.out.println(d1);
		
		c = new GregorianCalendar(2002, 6-1, 15);
		String d2 = sdf2.format(new Date(c.getTimeInMillis()));
		System.out.println(d2); // 2002�� 06�� 15��
		
		String bd = "2222-01-11";
		String[] temp = bd.split("-");
		for(String day1:temp) {
			System.out.println(day1);
		}
		
		
	}

}
