package test.stack;

import java.util.Random;
import java.util.Scanner;

public class TestStack {

	Scanner sc = new Scanner(System.in);
	int[] iarr = new int[10];
	
	
	
	//�迭�� Ȯ�� 
	public void printAll() {
		for(int i = 0; i < iarr.length; i++) {
			System.out.println(iarr[i]);
		}
	}
	
	
	//�� �ֱ� 
	public void push() {
		Random r = new Random();
		int num = r.nextInt(100) +1;
		
		if(iarr[iarr.length-1] == 0) {
		for(int i = 0; i < iarr.length; i++) {
			if(iarr[i] == 0) {
				iarr[i] = num;
				break;
			}
		}
		System.out.println("�߰��Ϸ� !");
		}else {
			System.out.println("������ ������ �����ϱ� �߰��Ͻ÷��� ���� �� ������");
		}
	 }
	
	//�� ���� 
	public void pop() {
		if(iarr[0] != 0) {
		for(int i = iarr.length-1 ; i >= 0; i--) {
			if(iarr[i] != 0) {
				iarr[i] = 0;
				break;
			}
		}
		System.out.println("�����Ϸ� !");
		}else {
			System.out.println("������ ����־ �E ���� ���µ���");
		}
	}
	
	
}














