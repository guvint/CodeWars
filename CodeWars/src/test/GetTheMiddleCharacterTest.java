package test;

import org.junit.Test;

import kyu7.GetTheMiddleCharacter;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GetTheMiddleCharacterTest {
	@Test
	  public void basicTests() {
	    assertEquals("es", GetTheMiddleCharacter.getMiddle("test"));
	    assertEquals("dd", GetTheMiddleCharacter.getMiddle("middle"));
	    assertEquals("t", GetTheMiddleCharacter.getMiddle("testing"));
	    assertEquals("A", GetTheMiddleCharacter.getMiddle("A"));
	  }
	  
	  private String middle(String word) {
	    int mid = word.length() / 2;
	    return (word.length() % 2 == 1 ? word.substring(mid, mid+1) : word.substring(mid-1, mid+1));
	  }
	  
	  @Test
	  public void randTests() {
	    Random randGen = new Random();
	    String alph = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    for (int i = 0; i < 50; i++) {
	      int randLength = randGen.nextInt(1000)+1;
	      String testWord = "";
	      for (int e = 0; e < randLength; e++) {
	        int alphI = randGen.nextInt(alph.length());
	        testWord += alph.substring(alphI, alphI+1);
	      }
	      String expected = middle(testWord);
	      String actual = GetTheMiddleCharacter.getMiddle(testWord);
	      assertEquals("Middle of " + testWord + " is " + expected + " not " + actual, expected, actual);
	    }
	  }
}
