package test.stack;

import java.util.Random;
import java.util.Scanner;

public class TestStack {

	Scanner sc = new Scanner(System.in);
	int[] iarr = new int[10];
	
	
	
	//배열값 확인 
	public void printAll() {
		for(int i = 0; i < iarr.length; i++) {
			System.out.println(iarr[i]);
		}
	}
	
	
	//값 넣기 
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
		System.out.println("추가완료 !");
		}else {
			System.out.println("스택이 가득차 있으니까 추가하시려면 먼저 좀 뺴세요");
		}
	 }
	
	//값 삭제 
	public void pop() {
		if(iarr[0] != 0) {
		for(int i = iarr.length-1 ; i >= 0; i--) {
			if(iarr[i] != 0) {
				iarr[i] = 0;
				break;
			}
		}
		System.out.println("삭제완료 !");
		}else {
			System.out.println("스택이 비어있어서 뺼 값이 없는데요");
		}
	}
	
	
}














