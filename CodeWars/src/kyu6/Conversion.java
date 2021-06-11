package kyu6;

/**
 * Developed skills: ALGORITHMS, ENCODING.
 * 
 * Create a function taking a positive integer as its parameter and returning a string containing the 
 * Roman Numeral representation of that integer.
 * 
 * Modern Roman numerals are written by expressing each digit separately starting with the left most 
 * digit and skipping any digit with a value of zero. 
 * 
 * In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 
 * 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
 * 
 * Help:
 * Symbol    Value
 * I          1
 * V          5
 * X          10
 * L          50
 * C          100
 * D          500
 * M          1,000
 * 
 * Remember that there can't be more than 3 identical symbols in a row.
 */
public class Conversion {
	
    public static String solution(int n) {
    	String result = "";

    	while (n >= 1000) {
    		result += "M";
    		n -= 1000;
    	}
    	while (n >= 900) {
    		result += "CM";
    		n -= 900;
    	}
    	while (n >= 500) {
    		result += "D";
    		n -= 500;
    	}
    	while (n >= 400) {
    		result += "CD";
    		n -= 400;
    	}
    	while (n >= 100) {
    		result += "C";
    		n -= 100;
    	}
    	while (n >= 90) {
    		result += "XC";
    		n -= 90;
    	}
    	while (n >= 50) {
    		result += "L";
    		n -= 50;
    	}
    	while (n >= 40) {
    		result += "XL";
    		n -= 40;
    	}
    	while (n >= 10) {
    		result += "X";
    		n -= 10;
    	}
    	while (n >= 9) {
    		result += "IX";
    		n -= 9;
    	}
    	while (n >= 5) {
    		result += "V";
    		n -= 5;
    	}
    	while (n >= 4) {
    		result += "IV";
    		n -= 4;
    	}
    	while (n >= 1) {
    		result += "I";
    		n -= 1;
    	}
    	
    	return result;
    }

	public static void main(String[] args) {
		System.out.println(solution(1000)); // = M
		System.out.println(solution(1990)); // = MCMXC
		System.out.println(solution(2008)); // = MMVIII
		System.out.println(solution(1666)); // = MDCLXVI
	}

}
