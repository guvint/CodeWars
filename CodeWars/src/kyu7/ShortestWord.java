package kyu7;

/**
 * Developed skills: FUNDAMENTALS
 * 
 * Simple, given a string of words, return the length of the shortest word(s).
 * 
 * String will never be empty and you do not need to account for different data
 * types.
 */
public class ShortestWord {

	public static int findShort(String s) {
		String[] array = s.split(" ");
		int min = array[0].length();
		
		for (String word : array) {
			if (min > word.length()) {
				min = word.length();
			}
		}
	
		return min;
	}

	public static void main(String[] args) {
		System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
		System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
		System.out.println(findShort("Let's travel abroad shall we"));
	}
}
