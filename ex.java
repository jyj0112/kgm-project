package mymy;

import java.util.*;

public class ex {
	static void wordList() {

		String input = "HTML5 is a series of new elements, "
				+ "updates to existing elements and new JavaScript APIs available through contemporary web browsers. "
				+ "In order to best describe what HTML5 is, "
				+ "perhaps starting with a few attributes of what HTML5 is not will help draw the most clear picture.";
		String[] word = input.split(" ");
		Arrays.sort(word);
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < word.length; i++) {
			if (i + 1 < word.length) {
				int count = check(word, i);
				result.add(word[i] + " " + (count + 1));
				i += count;
			}
		}
		for (int i = 0; i < result.size(); i++)
			System.out.println(result.get(i));
	}

	private static int check(String[] word, int i) {
		return word[i].equals(word[i + 1]) ? (1 + check(word, i + 1)) : 0;
	}
	
	static void alpha() {
		String input = "A BC a ewt xcvasf wer zzaaa qwads qaaa DA";
		int space=0, alphaA=0;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == 'A' || input.charAt(i) == 'a') 
				alphaA++;
		}
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == ' ')
				space++;
		}
		
		System.out.println("\n문자열 : " + input);
		System.out.println("\n문자열의 공백 갯수 : " + space + " 개");
		System.out.println("\n문자열의 'A' 갯수 : " + alphaA + " 개");
	
		
		
			
	}
	

	public static void main(String[] args) {
//		wordList();
		alpha();
	}
}
