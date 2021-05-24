package test;
import org.junit.Test;

import kyu8.RemoveExclamationMarks;

import java.util.Random;
import java.util.stream.*;
import static org.junit.Assert.assertEquals;

public class RemoveExclamationMarksTest {

    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarks("Hello World!"));
    }
    
    @Test
    public void testSimpleString2() {
        assertEquals("Hello World", RemoveExclamationMarks.removeExclamationMarks("Hello World!!!"));
    }
    
    @Test
    public void testSimpleString3() {
        assertEquals("Hi Hello", RemoveExclamationMarks.removeExclamationMarks("Hi! Hello!"));
    }
    
    @Test
    public void testRandomString() {
        String rs = String.format("%s!%s %s!%s", randomString(), randomString(), randomString(), randomString());
        assertEquals(solution(rs), RemoveExclamationMarks.removeExclamationMarks(rs));
    }
    
    private String randomString() {
        Random random = new Random();
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZbcdefghijklmnopqrstuvwxyz";
        return IntStream.range(0, 10)
                        .mapToObj(__ -> (char) abc.charAt(random.nextInt(abc.length())))
                        .map(String::valueOf)
                        .collect(Collectors.joining(""));
    }
    
    private String solution(String s) {
        return s.replaceAll("!", "");
    }
}