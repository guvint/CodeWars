package test;

import org.junit.Test;

import kyu6.PangramChecker;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class PangramCheckerTest {
	@Test
    public void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog.";
      PangramChecker pc = new PangramChecker();
      assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
      String pangram2 = "You shall not pass!";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram2));
    }
    @Test
    public void test3() {
      String pangram1 = "Cwm fjord bank glyphs vext quiz";
      PangramChecker pc = new PangramChecker();      
      assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test4() {      
      String pangram2 = "Pack my box with five dozen liquor jugs.";
      PangramChecker pc = new PangramChecker();      
      assertEquals(true, pc.check(pangram2));
    }
    @Test
    public void test5() {      
      String pangram3 = "How quickly daft jumping zebras vex.";
      PangramChecker pc = new PangramChecker();      
      assertEquals(true, pc.check(pangram3));
    }
    @Test
    public void test6() {      
      String pangram4 = "ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ";
      PangramChecker pc = new PangramChecker();
      assertEquals(true, pc.check(pangram4));
    }
    @Test
    public void test7() {
      String pangram5 = "abcdefghijklmopqrstuvwxyz";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram5));
    }
    @Test
    public void test8() {      
      String pangram6 = "A pangram is a sentence that contains every single letter of the alphabet at least once.";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram6));
    }
    
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private char[] shuffle(char[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = (int)(Math.random() * a.length);
            char t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
        return a;
    }
    @Test
    public void randomizedTests() {
        PangramChecker pc = new PangramChecker();
        for (int trial = 1; trial <= 50; trial++) {
            int wordBreaks = (int)(Math.random() * 8 + 1);
            char[] arr = new char[wordBreaks];
            Arrays.fill(arr, ' ');
            String spaces = new String(arr), sentence = "", missing = "";
            switch ( (int)(Math.random() * 3) ) {
            case 0: // non-pangram
                //System.out.println("non-pangram");
                arr = Arrays.copyOf(shuffle(alphabet.toCharArray()), alphabet.length());
                int removals = (int)(Math.random() * 15 + 1);
                sentence = new String(arr, 0, 26 - removals);
                missing = new String(arr, sentence.length(), removals);
                break;
            case 1: // exact pangram
                //System.out.println("exact pangram");
                sentence = alphabet;
                break;
            case 2: // pangram w/extras
                //System.out.println("pangram w/extras");
                char[] extras = new char[(int)(Math.random() * 15) + 1];
                for (int i = 0; i < extras.length; i++)
                    extras[i] = alphabet.charAt((int)(Math.random() * 26));
                sentence = alphabet.concat(new String(extras));
                break;
            }
            sentence = (new String(shuffle(sentence.concat(spaces).toCharArray()))).replaceAll("\\s\\s*"," ").trim();
            System.out.format("Test #%2d: \"%s\"\n", trial, sentence);
            String failMsg = String.format("\"%s\" is %sa pangram.\n%s",
                                           sentence,
                                           (missing.length() > 0 ? "not " : ""),
                                           (missing.length() > 0 ? "Missing " + missing + "\n" : ""));
            assertEquals(failMsg, 0 == missing.length(), pc.check(sentence));
        }
    }
}