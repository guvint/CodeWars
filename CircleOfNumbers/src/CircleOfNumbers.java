/*
 * Developed skills: puzzles, games.
 * 
 * Task:
 * Consider integer numbers from 0 to n - 1 written down along the circle in such a way that the distance between any two neighbouring numbers is equal (note that 0 and n - 1 are neighbouring, too).
 * Given n and firstNumber/first_number, find the number which is written in the radially opposite position to firstNumber.
 * 
 * Input/Output:
 * [input] integer n
 * A positive even integer.
 * Constraints: 4 ≤ n ≤ 1000.
 * [input] integer firstNumber/first_number
 * Constraints: 0 ≤ firstNumber ≤ n - 1
 * [output] an integer
 */ 

public class CircleOfNumbers {
    public static int circleOfNumbers(int n, int firstNumber) {
    	int opposite = 0;
    	
    	if ((n % 2 == 0) && (4 <= n && n <= 1000) && ((0 <= firstNumber && firstNumber <= n - 1))) {
        if (firstNumber >= n/2) {
          opposite = firstNumber - (n/2);
        } else if (firstNumber < n/2) {
          opposite = firstNumber + (n/2);
        }        
      }
    	
    	return opposite;
    }
}