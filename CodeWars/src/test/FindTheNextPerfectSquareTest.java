package test;
import org.junit.Test;

import kyu7.FindTheNextPerfectSquare;

import static org.junit.Assert.assertEquals;

public class FindTheNextPerfectSquareTest {
	@Test
	public void test1() {
		assertEquals(144, FindTheNextPerfectSquare.numberFun(121));
	}

	@Test
	public void test2() {
		assertEquals(676, FindTheNextPerfectSquare.numberFun(625));
	}

	@Test
	public void test3() {
		assertEquals(-1, FindTheNextPerfectSquare.numberFun(114));
	}
}
