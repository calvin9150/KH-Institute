package com.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.common.Car;

public class MapController {
	public static void main(String[] args) {
		//Map�� ���� �˾ƺ���.
		//map�� ������ �̷���� �ִ� ���� -> key : value
		//key, value type -> �Ѵ� ObjectŸ���� ���
		//��� key���� String���� ���� �����.
		//value : ��ü!
		
		//Map�� Collection�� ��ӹ��� �ʾ���.
		//�żҵ��� ��Ī�̳� Ȱ���� �ణ �ٸ�
		HashMap map=new HashMap();
		//���ֱ� -> put(key, value);
		map.put("��","A");
		map.put("��","B");
		map.put("��","C");
		System.out.println(map);
		
		//����� �� ��������
		//����� ���� key���ؼ� ������.
		//get(key);
		System.out.println(map.get("��"));
		System.out.println(map.get("��"));
		
		//key���� �ߺ��� �Ұ�����.
		map.put("��", "������");
		System.out.println(map.get("��"));
		
		map.remove("��");
		
		System.out.println(map);
		System.out.println(map.get("��"));
		
		
		//map�� �ִ� ������ ��ü ��ȸ�ϱ�.
		// ��ȸ�ϴ¹�� 2����
		//1. key���� ��°�� ������ key�� �����ϴ¹��
		//keySet() -> map�� key Set������� ��ȯ�ϴ� �޼ҵ�
		Set keys=map.keySet();//key���� ��ȯ��.
		
		Iterator it=keys.iterator();
		while(it.hasNext()) {
			String key=(String)it.next();//key��
			System.out.println(key+" : "+map.get(key));
		}
		
				
		
		//2. key,value��� ������ �����ϴ� ���
		//key,value ��� �����ϴ� Ŭ������ �̿��� -> Map.EntryŬ����
		
		Set entrySets=map.entrySet();
		Iterator entryIt=entrySets.iterator();
		while(entryIt.hasNext()) {
			Map.Entry en=(Map.Entry)entryIt.next();
			System.out.println(en.getKey()+" : "+en.getValue());
		}
		
		
		//�����Ͱ� �ִ��� Ȯ��
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey("��"));
		System.out.println(map.containsValue("A"));
		
		//�������� ������ Ȯ��
		System.out.println(map.size());
		
		
		//������ ��ü �����
		map.clear();
		
		//map�� �����ؼ�
		//key�� String, value Car
		// 1 : ��� ��� 5õ 4 
		// 2 : �׷��� ������ 8õ 4
		// 3 : ī�Ϲ� ȸ�� 6õ 9
		// 4 : �׽��� ���� 1��3õ 4
		
		//1. ��ü �����͸� ����ϱ� (����, ���� ����)
		//2. ������ 7õ���� �̻��� ��(����, ����, �ο���) �� ���
		
		HashMap cars=new HashMap();
		cars.put(1, new Car("���","���",50000000,4));
		cars.put(2, new Car("�׷���","������",80000000,4));
		cars.put(3, new Car("ī�Ϲ�","ȸ��",60000000,4));
		cars.put(4, new Car("�׽���","����",130000000,4));
		
		Set carKey=cars.keySet();
		Iterator carit=carKey.iterator();
		while(carit.hasNext()) {
			Car c=(Car)cars.get(carit.next());
			System.out.println(c.getName()+" "+c.getColor()+" "+c.getPrice());
			//System.out.println(cars.get(carit.next()));
		}
		
		Set entryCar=cars.entrySet();
		Iterator entryit=entryCar.iterator();
		
		while(entryit.hasNext()) {
			Map.Entry entry=(Map.Entry)entryit.next();
			Car c=(Car)entry.getValue();
			if(c.getPrice()>70000000) {
				System.out.println(c.getName()+" "+c.getPrice()+" "+c.getPerson());
			}
			
		}
	}
}







