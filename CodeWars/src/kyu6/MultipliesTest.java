package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultipliesTest {
	@Test
    public void test() {
      assertEquals(23, new Multiplies().solution(10));
      assertEquals(78, new Multiplies().solution(20));
      assertEquals(9168, new Multiplies().solution(200));
    }
}