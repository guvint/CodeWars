package test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

import kyu6.DRoot;

public class DRootTest {
	// Reference implementation for the random test cases
	private static class PrivateTestClass {
		public static int digital_root(int n) {
			return n > 0 ? 1 + (n - 1) % 9 : 0;
		}
	}

	private final Random random = new Random();

	@Test
	public void Test1() {
		assertEquals("Nope!", 7, DRoot.digital_root(16));
	}

	@Test
	public void Test2() {
		assertEquals("Nope!", 6, DRoot.digital_root(195));
	}

	@Test
	public void Test3() {
		assertEquals("Nope!", 2, DRoot.digital_root(992));
	}

	@Test
	public void Test4() {
		assertEquals("Nope!", 9, DRoot.digital_root(99999999));
	}

	@Test
	public void Test5() {
		assertEquals("Nope!", 9, DRoot.digital_root(167346));
	}

	@Test
	public void Test6() {
		assertEquals("Nope!", 1, DRoot.digital_root(10));
	}

	@Test
	public void Test7() {
		assertEquals("Nope! Should work for 0", 0, DRoot.digital_root(0));
	}

	@Test
	public void Test8() {
		System.out.println("100 Random Tests");
		for (int i = 0; i < 100; i++) {
			int n = random.nextInt(1000000);
			assertEquals("Nope! Should work for " + n, PrivateTestClass.digital_root(n), DRoot.digital_root(n));
		}
	}
}