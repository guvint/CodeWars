package test;

import org.junit.Test;

import kyu8.YesOrNo;

import static org.junit.Assert.assertEquals;

public class YesOrNoTest {
	@Test
	public void testBoolToWord() {
		assertEquals(YesOrNo.yesOrNo(true), "Yes");
		assertEquals(YesOrNo.yesOrNo(false), "No");
	}
}