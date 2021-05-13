import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class THBTest {
	@Test
	public void basicTest() {
		THB check = new THB();
		assertEquals("btttthTHBth", check.testing("Remember to test for only the THB's, nothing else"));
	}

	@Test
	public void testNull() {
		THB check = new THB();
		String error = null;
		assertEquals("", check.testing(error));
	}

	@Test
	public void testEmpty() {
		THB check = new THB();
		assertEquals("", check.testing(""));
	}

	@Test
	public void testComplex() {
		THB check = new THB();
		assertEquals("ThB", check.testing("1   0 3 4 86 ! # $ ^ T8 1 # )* % h1 3 4 ^ ! ) * ! 3 4B 6 ) *! # $ 6 "));
	}

	@Test
	public void testSingle() {
		THB check = new THB();
		assertEquals("H", check.testing("H"));
	}

	@Test
	public void testRandom1() {
		THB check = new THB();
		String tester = "";
		for (int j = 0; j < Math.random() * 100; j++) {
			tester += (int) (Math.random() * 123);
		}
		assertEquals(tester == null ? "" : tester.replaceAll("[^thbTHB]", ""), check.testing(tester));
	}

	@Test
	public void testRandom2() {
		THB check = new THB();
		String tester = "";
		for (int j = 0; j < Math.random() * 100; j++) {
			tester += (int) (Math.random() * 123);
		}
		assertEquals(tester == null ? "" : tester.replaceAll("[^thbTHB]", ""), check.testing(tester));
	}

	@Test
	public void testRandom3() {
		THB check = new THB();
		String tester = "";
		for (int j = 0; j < Math.random() * 100; j++) {
			tester += (int) (Math.random() * 123);
		}
		assertEquals(tester == null ? "" : tester.replaceAll("[^thbTHB]", ""), check.testing(tester));
	}

	@Test
	public void testRandom4() {
		THB check = new THB();
		String tester = "";
		for (int j = 0; j < Math.random() * 100; j++) {
			tester += (int) (Math.random() * 123);
		}
		assertEquals(tester == null ? "" : tester.replaceAll("[^thbTHB]", ""), check.testing(tester));
	}

	@Test
	public void testRandom5() {
		THB check = new THB();
		String tester = "";
		for (int j = 0; j < Math.random() * 100; j++) {
			tester += (int) (Math.random() * 123);
		}
		assertEquals(tester == null ? "" : tester.replaceAll("[^thbTHB]", ""), check.testing(tester));
	}

	@Test
	public void testRandom6() {
		THB check = new THB();
		String tester = "";
		for (int j = 0; j < Math.random() * 100; j++) {
			tester += (int) (Math.random() * 123);
		}
		assertEquals(tester == null ? "" : tester.replaceAll("[^thbTHB]", ""), check.testing(tester));
	}

	@Test
	public void testRandom7() {
		THB check = new THB();
		String tester = "";
		for (int j = 0; j < Math.random() * 100; j++) {
			tester += (int) (Math.random() * 123);
		}
		assertEquals(tester == null ? "" : tester.replaceAll("[^thbTHB]", ""), check.testing(tester));
	}

	@Test
	public void testRandom8() {
		THB check = new THB();
		String tester = "";
		for (int j = 0; j < Math.random() * 100; j++) {
			tester += (int) (Math.random() * 123);
		}
		assertEquals(tester == null ? "" : tester.replaceAll("[^thbTHB]", ""), check.testing(tester));
	}

	@Test
	public void testRandom9() {
		THB check = new THB();
		String tester = "";
		for (int j = 0; j < Math.random() * 100; j++) {
			tester += (int) (Math.random() * 123);
		}
		assertEquals(tester == null ? "" : tester.replaceAll("[^thbTHB]", ""), check.testing(tester));
	}

	@Test
	public void testRandom10() {
		THB check = new THB();
		String tester = "";
		for (int j = 0; j < Math.random() * 100; j++) {
			tester += (int) (Math.random() * 123);
		}
		assertEquals(tester == null ? "" : tester.replaceAll("[^thbTHB]", ""), check.testing(tester));
	}
}