import static org.junit.Assert.*;
import org.junit.Test;

public class InPartsTest {

	private static void testing(String actual, String expected) {
		assertEquals(expected, actual);
	}

	@Test
	public void test() {
		System.out.println("Fixed Tests splitInParts");
		String ans = InParts.splitInParts("supercalifragilisticexpialidocious", 3);
		String sol = "sup erc ali fra gil ist ice xpi ali doc iou s";
		testing(ans, sol);
		ans = InParts.splitInParts("HelloKata", 3);
		sol = "Hel loK ata";
		testing(ans, sol);
		ans = InParts.splitInParts("HelloKata", 1);
		sol = "H e l l o K a t a";
		testing(ans, sol);
		ans = InParts.splitInParts("HelloKata", 9);
		sol = "HelloKata";
		testing(ans, sol);
		ans = InParts.splitInParts("IamnowagoodcoderatCodewars", 9);
		sol = "Iamnowago odcoderat Codewars";
		testing(ans, sol);
	}

	// ---------------------------
	private static int randInt(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}

	public static String doEx() {
		String res = "";
		int n = -1;
		for (int i = 0; i < 100; i++) {
			if (i % 5 == 0)
				n = randInt(65, 90);
			else
				n = randInt(97, 122);
			res += (char) n;
		}
		return res;
	}

	public static String splitInPartsSol(String s, int partLength) {
		StringBuilder str = new StringBuilder(s);
		int ndx = partLength;
		partLength++;
		while (ndx < str.length()) {
			str = str.insert(ndx, " ");
			ndx += partLength;
		}
		return str.toString();
	}

	// ---------------------------
	@Test
	public void test1() {
		System.out.println("100 Random Tests");
		for (int i = 0; i < 100; i++) {
			String s1 = doEx();
			int limit = Math.max(1, (int) (s1.length() / 7));
			int n = randInt(1, limit);
			// System.out.println(s1);
			String sol = splitInPartsSol(s1, n);
			// System.out.println(sol);
			// System.out.println("****");
			assertEquals(sol, InParts.splitInParts(s1, n));
		}
	}
}