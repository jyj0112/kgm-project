package menu.model;

import java.util.ArrayList;
import java.util.Random;

//기능메소드 집합
public class MenuList { 
	Random menu = new Random();
	ArrayList<String> str = new ArrayList<String>();
	
	public MenuList() {
	}

	// 1번 분식류
	public void Bob1() {
		String[] food = { "돈까스", "참치김밥", "오므라이스", "라면", "뚝불" };
			
			System.out.println(food[menu.nextInt(food.length)] + "(이)가 당첨되었습니다.");
	} // Bob1 메소드
		// 2번 국and밥류

	public void Bob2() {
		String[] food = { "순대국밥", "육개장", "7분김치찌개", "비빔밥", "백반" };
		String[] one = new String[1];

		for (int i = 0; i < 1; i++) {
			one[i] = food[menu.nextInt(5)];
		}
		for (int i = 0; i < 1; i++) {
			System.out.println(one[i] + "(이)가 당첨되었습니다.");
		}
	} // Bob2 메소드

	// 3번 면and그외
	public void Bob3() {
		String[] food = { "라면", "소바", "토스트", "편의점", "맥창" };
		String[] one = new String[1];
		for (int i = 0; i < 1; i++) {
			one[i] = food[menu.nextInt(5)];
		}
		for (int i = 0; i < 1; i++) {
			System.out.println(one[i] + "(이)가 당첨되었습니다.");
		}
	}

	public void Bob4() {
		 
		
	}
	
}
