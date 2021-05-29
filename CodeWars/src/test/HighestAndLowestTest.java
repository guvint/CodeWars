package test;

import org.junit.Test;

import kyu7.HighestAndLowest;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.*;

public class HighestAndLowestTest {
	@Test
	public void someTest() {
		assertThat(HighestAndLowest.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), is("542 -214"));
	}

	@Test
	public void sortTest() {
		assertThat(HighestAndLowest.highAndLow("10 2 -2 -10"), is("10 -10"));
	}

	@Test
	public void plusMinusTest() {
		assertThat(HighestAndLowest.highAndLow("1 -1"), is("1 -1"));
	}

	@Test
	public void plusPlusTest() {
		assertThat(HighestAndLowest.highAndLow("1 1"), is("1 1"));
	}

	@Test
	public void minusMinusTest() {
		assertThat(HighestAndLowest.highAndLow("-1 -1"), is("-1 -1"));
	}

	@Test
	public void plusMinusZeroTest() {
		assertThat(HighestAndLowest.highAndLow("1 -1 0"), is("1 -1"));
	}

	@Test
	public void plusPlusZeroTest() {
		assertThat(HighestAndLowest.highAndLow("1 1 0"), is("1 0"));
	}

	@Test
	public void minusMinusZeroTest() {
		assertThat(HighestAndLowest.highAndLow("-1 -1 0"), is("0 -1"));
	}

	@Test
	public void singleTest() {
		assertThat(HighestAndLowest.highAndLow("42"), is("42 42"));
	}

	private static final int NUM_RANDOM_TESTS = 10;
	private static final int MAX_X = 1000;

	@Test
	public void randomTest() {
		Random r = new Random();

		for (int i = 0; i < NUM_RANDOM_TESTS; i++) {
			ArrayList<Integer> numbers = new ArrayList<Integer>();

			for (int o = 0; o < r.nextInt(10) + 5; o++)
				numbers.add(r.nextInt(MAX_X * 2) - MAX_X);

			String s = numbers.get(0).toString();
			for (int o = 1; o < numbers.size(); o++)
				s += " " + numbers.get(o).toString();

			assertThat(HighestAndLowest.highAndLow(s), is(Collections.max(numbers) + " " + Collections.min(numbers)));
		}
	}
}
