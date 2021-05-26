package test;

import org.junit.Test;

import kyu8.EvenOrOdd;

import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {
	@Test
	public void testEvenOrOdd() {
		assertEquals("Even", EvenOrOdd.even_or_odd(6));
		assertEquals("Odd", EvenOrOdd.even_or_odd(7));
		assertEquals("Even", EvenOrOdd.even_or_odd(0));
		assertEquals("Odd", EvenOrOdd.even_or_odd(8273));
		assertEquals("Odd", EvenOrOdd.even_or_odd(-35));
	}

	private int randint(int min, int max) {
		return min + (int) (Math.random() * (max - min));
	}

	@Test
	public void randomTests() {
		int n = randint(-10000, 100000);
		String sol = n % 2 == 0 ? "Even" : "Odd";
		for (int i = 0; i < 100; i++) {
			assertEquals(sol, EvenOrOdd.even_or_odd(n));
		}
	}

}
