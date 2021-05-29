package test;
 
import org.junit.Test;

import kyu7.SquareDigit;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class SquareDigitTest {
	@Test
	public void test() {
		assertEquals(811181, new SquareDigit().squareDigits(9119));
		assertEquals(9414, new SquareDigit().squareDigits(3212));
		assertEquals(4114, new SquareDigit().squareDigits(2112));
		assertEquals(0, new SquareDigit().squareDigits(0));
	}

	@Test
	public void randomTest() {
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int test = 0;
			test += random.nextInt(10);
			test += random.nextInt(10) * 10;
			test += random.nextInt(10) * 10 * 10;
			test += random.nextInt(10) * 10 * 10 * 10;

			assertEquals(squareDigits(test), new SquareDigit().squareDigits(test));

		}
	}

	private int squareDigits(int n) {

		String strDigits = String.valueOf(n);
		String result = "";

		for (char c : strDigits.toCharArray()) {
			int digit = Character.digit(c, 10);
			result += digit * digit;
		}

		return Integer.parseInt(result);
	}

}