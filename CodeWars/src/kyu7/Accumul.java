package kyu7;

/**
 * Developed skills: fundamentals.
 * 
 * The examples below show you how to write function accum:
 * 
 * accum("abcd")    -> "A-Bb-Ccc-Dddd" 
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy" 
 * accum("cwAt")    -> "C-Ww-Aaa-Tttt" 
 * 
 * The parameter of accum is a string which includes only letters from a..z and A..Z.
 *
 */
public class Accumul {

	public static String accum(String s) {
		String result = "";
		
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);;
			
			for (int j = 0; j <= i; j++) {
				
				if (j == 0) {
					result += Character.toUpperCase(temp);
				} else {
					result += Character.toLowerCase(temp);
				}		
			}
			result += "-";
		}
		
		result = result.replaceAll(".$", "");
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(accum("abcd"));
		System.out.println(accum("RqaEzty"));
		System.out.println(accum("cwAt"));
	}

}
