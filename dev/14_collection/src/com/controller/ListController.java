package com.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import com.common.FoodCalAsc;
import com.common.FoodCalDsc;
import com.common.FoodNameAsc;
import com.common.FoodNameDsc;
import com.common.IntegerOrderAsc;
import com.common.IntegerOrderDesc;
import com.common.TestLambda;
import com.model.vo.Food;

public class ListController {
	public static void main(String[] args) {
		//ArrayListŬ���� �̿��ϱ� 
		//ArrayList �迭�� ������ ���������� ������, �迭�� ������ ������ �ڷᱸ������
		//ArrayList�� Ŭ������ �����ؼ� �̿�����.
		//Ŭ���� ������ ��ü�� �żҵ带 �̿��ؼ� ������ (����, �߰�, ����, ����...)
		ArrayList list=new ArrayList();
		//list ��ü�� 10�� ������ �� �ִ� ���� Ȯ��! -> �迭���� �ε����� ���� ������
		ArrayList list2=new ArrayList(20);//20�� ����Ȯ��
		//������ ����Ҵ� Object[]�� �Ǿ�����.
		
		//ArrayList List�������̽�, Collection�������̽��� ����
		//List ����, Collection������ ���Ե� �� �ִ�.
		List l=new ArrayList();
		Collection c=new ArrayList();
		
		//������ ArrayListȰ���ϱ�
		//1. ArrayList�� ��ü�����ϱ�
		// add()�żҵ带 �̿��ؼ� ArrayList����ҿ� ����
		list.add(true);//�⺻�ڷ��� �ٵ� ��� ��ü�� ����? ;;;; ����!!! ����Ŭ����!
		list.add(19);
		list.add("������");
		list.add(new Date());
		System.out.println(list);
		//list�� �� �ִ� ��ü�� Ȯ�� -> size();
		System.out.println(list.size());
		
		//ArrayList�� Ư����ü�� ����!
		//�л���. StudentŬ������ ����.
		//���ϵ� fruitŬ������ ����
		ArrayList foods=new ArrayList();
		foods.add(new Food("���뱹",7000,"����",1000,null));
		foods.add(new Food("������",8000,"��",650,
				new Date(new GregorianCalendar(2021,02,20).getTimeInMillis())));
		foods.add(new Food("����ʹ�",1000,"�ʹ�",200,null));
		
		System.out.println(foods);
		
		//����Ʈ�� ����Ǿ��ִ� �� ����ϱ�
		//list�� ����� ���� ��������
		//get()�żҵ�� index���� �������� ������.
		//index���� ���� 0���� ����
		Food f=(Food)foods.get(0);//���뱹
		System.out.println(f.getName()+" "+f.getPrice());
		System.out.println(((Food)foods.get(1)).getName()+" "+((Food)foods.get(1)).getPrice());
		
		for(int i=0;i<foods.size();i++) {
			Food temp=(Food)foods.get(i);
			System.out.println(temp.getName()+" "+temp.getPrice());
		}
		for(Object f1 : foods) {
			Food temp=(Food)f1;
			System.out.println(temp.getName()+" "+temp.getPrice());
		}
		
		//������ Į�θ��� 500�̻��� ���� �������
		for(int i=0;i<foods.size();i++) {
			Food t=(Food)foods.get(i);
			if(t.getCalorie()>=500) {
				System.out.println(t);
			}
		}
	
		//ArrayList�� ������ �����ϱ�
		//remove()�żҵ��̿�
		// �ε����� �̿��ؼ� ���� / ���ϰ�ü�� �̿��ؼ� ����
//		foods.remove(1);
//		foods.remove(1);
		System.out.println("adssadasdasdads");
		System.out.println(foods);
		foods.remove(new Food("����ʹ�",1000,"�ʹ�",200,null));//??????? ��..��...��..��
		System.out.println(foods);
		
		//ArrayList�� �ִ� �� �����ϱ�
		//set()�żҵ带 �̿� 
		foods.set(1, new Food("���",1200,"��",680,null));
		System.out.println(foods);
		//���ϴ� ��ġ�� ���� �߰��ϱ�
		//add(index, ��);
		foods.add(0,new Food("����",28000,"��",1368,null));
		System.out.println(foods);
		
		//list�� �� ��ü �����ϱ�
		System.out.println(list);
		list.clear();
		System.out.println(list);
		
		//�߰� ������ �żҵ�
		//list�� ���� �ִ��� Ȯ���ϱ�
		//contains()�żҵ��̿� -> equals�żҵ尡 �������̵� �Ǿ��־����.
		//for(int i=0;i<foods.size();i++) {
		if(!foods.contains(new Food("���",1200,"��",680,null))) {
			foods.add(new Food("���",1200,"��",680,null));
		}
		//}
		
		//list�� ����� ���� �ִ��� ���� Ȯ�� �żҵ�
		//isEmpty() -> ����ִ�???
		System.out.println(foods.isEmpty());
		System.out.println(list.isEmpty());
		//list�� ���� ���ٸ� for�� ����������.
		if(!foods.isEmpty()) {//==foods.size()==0;
			for(Object t : foods) {
				System.out.println(t);
			}
		}
		
		// indexOf(��ü) : �Ű������� ��ġ�ϴ� ���� �ε�����ȣ ��ȯ
		System.out.println(foods.indexOf(new Food("���",1200,"��",680,null)));
		
		// toArray() : list�� ����� ��ü�� Object�迭�� ��ȯ���ִ� �żҵ�
		Object[] objFood=foods.toArray();
		for(int i=0;i<objFood.length;i++) {
			System.out.println(objFood[i]);
		}
		
		//list�� �ߺ������͵� ������ ������
		foods.add(new Food("������",2500,"�丮",1300,null));
		foods.add(new Food("����Ƽ",2000,"��",100,null));
		foods.add(new Food("������Ľ�Ÿ",3400,"��",950,null));
		foods.add(new Food("�ܹ���",6700,"��",700,null));
		foods.add(new Food("������",9000,"��",780,null));
		
		for(int i=0;i<foods.size();i++) {
			System.out.println(foods.get(i));
		}
		
		//����Ʈ ������ ����.
		//������ ����!
		ArrayList numbers=new ArrayList();
		for(int i=0;i<10;i++) {
			numbers.add((int)(Math.random()*10));
		}
		System.out.println(numbers);
		
		//Collections.sort(numbers);//���ķ���!������������
		Collections.sort(numbers, new IntegerOrderAsc());//��������
		System.out.println(numbers);
		
		Collections.sort(numbers, new IntegerOrderDesc());//��������
		System.out.println(numbers);
		
		
		
		
		//Collections.sort(numbers, (Object o1,Object o2) -> (Integer)o2-(Integer)o1);
//		numbers.sort((Object o1, Object o2) -> (Integer)o2-(Integer)o1);
		
	//	System.out.println(numbers);
		
		
		
//		for(int i=0;i<numbers.size();i++) {
//			for(int j=0;j<i;j++) {
//				
//			}
//		}
		
		
		//foods�� �ִ� ���� ���ǿ� ���� �����غ���.
		//1. Į�θ��� �������� �������������غ��ô�.
		
		for(Object f1 : foods){
			System.out.println(f1);
		}
		
		Collections.sort(foods,new FoodCalAsc());
		System.out.println("������ ===================");
		for(Object f1 : foods) {
			System.out.println(f1);
		}
		
		Collections.sort(foods,new FoodCalDsc());
		System.out.println("�������� ������ ===================");
		for(Object f1 : foods) {
			System.out.println(f1);
		}
		
		//2. ���ڿ� �����ϱ� �����̸����� �����ϱ�
		// - ������������ �����ϱ�
		//System.out.println("������">"������"); //���???
		// String��ü���� ���ڿ��� �����ִ� �żҵ带 ��������
		// compareTo() -> str1.compareTo(str2) -> str1 str2 �� return -, +, 0
		
		Collections.sort(foods,new FoodNameAsc());
		
		System.out.println("�̸� �������� ������ ===================");
		for(Object f1 : foods) {
			System.out.println(f1);
		}
		
		//Arrays.sort();
		foods.sort(new FoodNameDsc());
		System.out.println("�̸� �������� ������ ===================");
		for(Object f1 : foods) {
			System.out.println(f1);
		}
		
		//food[0].compareTo(food[1]);
		


//		for(int i=0;i<10;i++) {
//			for(int j=0;j<i;j++) {
//				if(compare()>0) {
//					
//				}
//			}
//		}
		
		//��ü�� ���� ������ �ϴµ�......
		//�͸�Ŭ����... 1ȸ��
		Collections.sort(foods, new Comparator<Food>() {
			@Override
			public int compare(Food f1, Food f2) {
				return f1.getPrice()-f2.getPrice();
			}
		});
		
		
		
		
		System.out.println("���ݼ����� ����=====");
		for(Object f1 : foods) {
			System.out.println(f1);
		}
		
		//lambda : (�Ű�����,..,..,) -> { ���� } 
		//@FunctionalInterface -> �߻�޼ҵ� �Ѱ��� ����� �������̽�!
		//�⺻������ Interface���� �����ؾ��ϴ� �޼ҵ� ����
		//int compare(Object o1, Object o2)
		Collections.sort(foods, (Object o1, Object o2) -> {
			return ((Food)o1).getCategory().compareTo(((Food)o2).getCategory());
		});
		
		TestLambda testfilter=(Food temp)-> temp.getPrice()>20000;
		
		System.out.println("========================== ���� ===================");
		List result=filter(foods, (Food temp) -> temp.getPrice()>8000);
		result=filter(foods,(Food temp) -> temp.getCategory().contains("��"));
		for(Object o : result) {
			System.out.println(o);
		}
		
		
		
	}
	
	public static List filter(List list, TestLambda filter) {
		List result=new ArrayList();
		for(Object o : list) {
			if(filter.test((Food)o)) {
				result.add(o);
			}
		}
		return result;
	}
}



