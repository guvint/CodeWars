package test;
import org.junit.Test;

import kyu8.TripleTrouble;

import static org.junit.Assert.assertEquals;
import java.util.Random;

public class TripleTroubleTest {
	private String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private Random randGen = new Random();

	@Test
	public void basicTests() {
		assertEquals("abcabcabc", TripleTrouble.tripleTrouble("aaa", "bbb", "ccc"));
		assertEquals("abcabcabcabcabcabc", TripleTrouble.tripleTrouble("aaaaaa", "bbbbbb", "cccccc"));
		assertEquals("brrueordlnsl", TripleTrouble.tripleTrouble("burn", "reds", "roll"));
		assertEquals("Supermans", TripleTrouble.tripleTrouble("Sea", "urn", "pms"));
		assertEquals("LexLuthor", TripleTrouble.tripleTrouble("LLh", "euo", "xtr"));
	}

	@Test
	public void randomTests() {
		for (int i = 0; i < 100; i++) {
			int rand = randGen.nextInt(100);
			String one = randStr(rand);
			String two = randStr(rand);
			String three = randStr(rand);
			String msg = "Should work for:\n" + one + ",\n" + two + ",\n" + three + ".\n";
			assertEquals(msg, tripleAns(one, two, three), TripleTrouble.tripleTrouble(one, two, three));
		}
	}

	private String randStr(int n) {
		String t = "";
		for (int i = 0; i < n; i++) {
			t += "" + alph.charAt(randGen.nextInt(alph.length()));
		}
		return t;
	}

	private String tripleAns(String a, String b, String c) {
		String t = "";
		for (int i = 0; i < a.length(); i++) {
			t += a.substring(i, i + 1) + b.substring(i, i + 1) + c.substring(i, i + 1);
		}
		return t;
	}
}