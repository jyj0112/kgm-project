package menu.model;

import java.util.ArrayList;
import java.util.Random;

//��ɸ޼ҵ� ����
public class MenuList { 
	Random menu = new Random();
	ArrayList<String> str = new ArrayList<String>();
	
	public MenuList() {
	}

	// 1�� �нķ�
	public void Bob1() {
		String[] food = { "���", "��ġ���", "���Ƕ��̽�", "���", "�Һ�" };
			
			System.out.println(food[menu.nextInt(food.length)] + "(��)�� ��÷�Ǿ����ϴ�.");
	} // Bob1 �޼ҵ�
		// 2�� ��and���

	public void Bob2() {
		String[] food = { "���뱹��", "������", "7�б�ġ�", "�����", "���" };
		String[] one = new String[1];

		for (int i = 0; i < 1; i++) {
			one[i] = food[menu.nextInt(5)];
		}
		for (int i = 0; i < 1; i++) {
			System.out.println(one[i] + "(��)�� ��÷�Ǿ����ϴ�.");
		}
	} // Bob2 �޼ҵ�

	// 3�� ��and�׿�
	public void Bob3() {
		String[] food = { "���", "�ҹ�", "�佺Ʈ", "������", "��â" };
		String[] one = new String[1];
		for (int i = 0; i < 1; i++) {
			one[i] = food[menu.nextInt(5)];
		}
		for (int i = 0; i < 1; i++) {
			System.out.println(one[i] + "(��)�� ��÷�Ǿ����ϴ�.");
		}
	}

	public void Bob4() {
		 
		
	}
	
}
