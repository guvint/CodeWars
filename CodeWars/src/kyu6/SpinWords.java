package kyu6;

/**
 * Developed skills: ALGORITHMS STRINGS FORMATTING
 * 
 * Write a function that takes in a string of one or more words, and returns the
 * same string, but with all five or more letter words reversed (like the name
 * of this kata).
 * 
 * Strings passed in will consist of only letters and spaces. Spaces will be
 * included only when more than one word is present. Examples:
 * 
 * spinWords("Hey fellow warriors") => "Hey wollef sroirraw" 
 * spinWords("This is a test") => "This is a test" 
 * spinWords("This is another test") => "This is rehtona test"
 */
public class SpinWords {

	public static String spinWords(String sentence) {

		String[] split = sentence.split(" ");
		String newSentence = "";
		
		for (int i = 0; i < split.length; i++) {
            
			if (split[i].length() >= 5) {
				StringBuilder input = new StringBuilder();
				String temp = "";
				
				input.append(split[i]);
				input.reverse();
				temp = input.toString();
				split[i] = temp;
			}
			
			newSentence += split[i] + " ";
        }
		
		newSentence = newSentence.trim();
				
		return newSentence;
	}

	public static void main(String[] args) {
		System.out.println(spinWords("Welcome"));
		System.out.println(spinWords("Hey fellow warriors"));
	}
}