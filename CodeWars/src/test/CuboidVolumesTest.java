package test;
import org.junit.Test;

import kyu8.CuboidVolumes;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class CuboidVolumesTest {
	@Test
	public void sampleTestCases() {

		int[] a1 = new int[] { 3, 2, 5 }, b1 = new int[] { 1, 4, 4 };
		assertEquals("Testing for: " + Arrays.toString(a1) + Arrays.toString(b1), 14,
				CuboidVolumes.findDifference(a1, b1));

		int[] a2 = new int[] { 9, 7, 2 }, b2 = new int[] { 5, 2, 2 };
		assertEquals("Testing for: " + Arrays.toString(a2) + Arrays.toString(b2), 106,
				CuboidVolumes.findDifference(a2, b2));

		int[] a3 = new int[] { 11, 2, 5 }, b3 = new int[] { 1, 10, 8 };
		assertEquals("Testing for: " + Arrays.toString(a3) + Arrays.toString(b3), 30,
				CuboidVolumes.findDifference(a3, b3));

		int[] a4 = new int[] { 4, 4, 7 }, b4 = new int[] { 3, 9, 3 };
		assertEquals("Testing for: " + Arrays.toString(a4) + Arrays.toString(b4), 31,
				CuboidVolumes.findDifference(a4, b4));

		int[] a5 = new int[] { 15, 20, 25 }, b5 = new int[] { 10, 30, 25 };
		assertEquals("Testing for: " + Arrays.toString(a5) + Arrays.toString(b5), 0,
				CuboidVolumes.findDifference(a5, b5));
	}

	@Test
	public void randomTestCases() {
		final int TEST_CASES = 100;
		final int UPPER_LIMIT = 30;
		for (int i = 0; i < TEST_CASES; i++) {
			int[] a = { randInt(UPPER_LIMIT), randInt(UPPER_LIMIT), randInt(UPPER_LIMIT) };
			int[] b = { randInt(UPPER_LIMIT), randInt(UPPER_LIMIT), randInt(UPPER_LIMIT) };

			int result = Math.abs(a[0] * a[1] * a[2] - b[0] * b[1] * b[2]);

			assertEquals("Testing for: " + Arrays.toString(a) + Arrays.toString(b), result,
					CuboidVolumes.findDifference(a, b));
		}
	}

	private int randInt(int upperLimit) {
		return (int) (Math.random() * upperLimit) + 1;
	}
}
