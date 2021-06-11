package test;

import org.junit.Test;

import kyu6.Conversion;

import static org.junit.Assert.assertEquals;

public class ConversionTest {

	@Test
	public void shouldConvertToRoman() {
		assertEquals("solution(1) should equal to I", "I", Conversion.solution(1));
		assertEquals("solution(4) should equal to IV", "IV", Conversion.solution(4));
		assertEquals("solution(6) should equal to VI", "VI", Conversion.solution(6));
		assertEquals("solution(14) should equal to XIV", "XIV", Conversion.solution(14));
		assertEquals("solution(21) should equal to XXI", "XXI", Conversion.solution(21));
		assertEquals("solution(89) should equal to LXXXIX", "LXXXIX", Conversion.solution(89));
		assertEquals("solution(91) should equal to XCI", "XCI", Conversion.solution(91));
		assertEquals("solution(984) should equal to CMLXXXIV", "CMLXXXIV", Conversion.solution(984));
		assertEquals("solution(1000) should equal to M", "M", Conversion.solution(1000));
		assertEquals("solution(1889) should equal to MDCCCLXXXIX", "MDCCCLXXXIX", Conversion.solution(1889));
		assertEquals("solution(1989) should equal to MCMLXXXIX", "MCMLXXXIX", Conversion.solution(1989));
	}
}
