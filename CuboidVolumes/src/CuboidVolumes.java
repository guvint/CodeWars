/*
 * Developed skills: fundamentals.
 * 
 * In this simple exercise, you will create a program that will take two lists of integers, a and b. Each list will 
 * consist of 3 positive integers above 0, representing the dimensions of cuboids a and b. You must find the difference 
 * of the cuboids' volumes regardless of which is bigger.
 * For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), the volume of a is 12 and the volume of b is 20. 
 * Therefore, the function should return 8.
 */
public class CuboidVolumes {
	public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {

		int a = firstCuboid[0] * firstCuboid[1] * firstCuboid[2];
		int b = secondCuboid[0] * secondCuboid[1] * secondCuboid[2];

		return Math.abs(a - b);
	}
}