package com.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.model.vo.Food;

public class ListController {
	public static void main(String[] args) {
		//ArrayListŬ���� �̿��ϱ�
		//�迭�� ������ ����ڽ��� ������, �迭�� ������ ������ �ڷᱸ������
		//ArrayList�� Ŭ������ �����ؼ� �̿�.
		//Ŭ���� ������ ��ü�� �޼��带 �̿��ؼ� ������ �Ѵ�.
		ArrayList list = new ArrayList(); // default�� 10�� ���� Ȯ��
		//list ��ü�� 10�� ������ �� �ִ� ���� Ȯ�� -> �迭������ index�� ���� ������
		ArrayList list2 = new ArrayList(20); // 20�� ���� Ȯ��
		//���� ����Ҵ� Object[]�� �Ǿ��ִ�.
		
		//ArrayList List�������̽� Collection �������̽� ����
		//List ����, Collection ������ ���Ե� �� �ִ�.
		List l = new ArrayList();
		Collection c = new ArrayList();
		
		//ArrayList�� ��ü �����ϱ�
		list.add(true); 
		list.add(18); // true, 18�� �⺻ �ڷ����ε� ��ü�ȿ� ��� ����? -> ����Ŭ����
		list.add("Gom");
		list.add(new Date());
		System.out.println(list); //[true, 18, Gom, Fri Feb 19 20:10:19 KST 2021] 
		//�� toString ó�� �˾Ƽ� �Ǿ�����
		System.out.println(list.size());
		
		//ArrayList�� Ư����ü�� �����Ѵ�.
		//�л���. StudentŬ���� ����
		ArrayList foods = new ArrayList();
		foods.add(new Food("���뱹", 7000, "����", 1000, null));
		foods.add(new Food("������", 10000, "��", 600, 
				new Date(new GregorianCalendar(2021,02,22).getTimeInMillis())));
		foods.add(new Food("����ʹ�", 1000, "�ʹ�", 200, null));
		
		System.out.println(foods);
		
		/*
		Food f = (Food)foods.get(0);
		System.out.println(f.getName()+" "+f.getPrice());
		System.out.println(((Food)foods.get(1)).getName()+" "+((Food)foods.get(1)).getPrice());
		for(int i=0; i<foods.size(); i++) {
			Food temp = (Food)foods.get(i);
			System.out.println(temp.getName()+ " "+temp.getPrice());
		}
		*/
		
		for(Object f1 : foods) {
			Food temp = (Food)f1;
			System.out.println(temp.getName()+" "+temp.getPrice());
		}
		
		//���� �� Į�θ��� 500�̻��� ���� ���
		for(int i=0; i<foods.size(); i++) {
			Food t = (Food)foods.get(i);
			if(t.getCalorie()>=500){
				System.out.println(t.getName());
			}
		}
		//ArrayList�� ������ �����ϱ�
		//remove() �޼��� ���
		// �ε��� �̿��ؼ� ���� or ���ϰ�ü �̿��ؼ� ����
			foods.remove(2); // ����ʹ� ����
		
		
		
		//ArrayList �� �ִ� �� ����
		//set() �޼��� �̿�
		foods.set(1, new Food("���", 1000, "��", 500, null)); // ������ -> ��� ����
		System.out.println(foods);
		//���ϴ� ��ġ�� �� �߰�
		foods.add(0, new Food("����", 20000, "���", 2300, null));
		System.out.println(foods);
		
		//list ��� �� ����
		list.clear();
		System.out.println(list);
		
		//�߰��� ������ �޼���
		//list�� ���� �ִ��� Ȯ�� : contains()
		//list�� ����� ���� �ִ��� Ȯ�� : isEmpty()
		if(!foods.isEmpty()) {
			System.out.println("������ �־��");
		}
		//indexOf(��ü) : �Ű������� ��ġ�ϴ� ���� �ε�����ȣ ��ȯ
		//toArray() : list�� ����� ��ü�� Object�迭�� ��ȯ���ִ� �޼���
		Object[] objFood = foods.toArray();
		for(int i=0; i<objFood.length; i++) {
//			System.out.println(objFood[i]);
		}
		//list�� �ߺ������͵� ���尡��
		foods.add(new Food("���", 1000, "��", 500, null));
		foods.add(new Food("���", 1000, "��", 500, null));
		foods.add(new Food("���", 1000, "��", 500, null));
		foods.add(new Food("���", 1000, "��", 500, null));
		foods.add(new Food("���", 1000, "��", 500, null));
		foods.add(new Food("���", 1000, "��", 500, null));
		for(int i=0; i<foods.size(); i++) {
			System.out.println(foods.get(i));
		}
		//�迭 �����ϱ�
		ArrayList numbers = new ArrayList();
		for(int i=0; i<10;i++) {
			numbers.add((int)(Math.random()*10));
		}
		Collections.sort(numbers);
		System.out.println(numbers);
	}
}
