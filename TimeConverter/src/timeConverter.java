/*
 * Developed skills: fundamentals.
 * 
 * Create a function that takes an integer argument of seconds and converts the value into a string describing how 
 * many hours and minutes comprise that many seconds.
 * Any remaining seconds left over are ignored.
 * 
 * Note:
 * The string output needs to be in the specific form - "X hour(s) and X minute(s)"
 * 
 * For example:
 * 3600 --> "1 hour(s) and 0 minute(s)"
 * 3601 --> "1 hour(s) and 0 minute(s)"
 * 3500 --> "0 hour(s) and 58 minute(s)"
 * 323500 --> "89 hour(s) and 51 minute(s)"
 */

public class timeConverter{
  public static String toTime(int seconds){
    int hours;
    int minutes = 0;
    
    hours = seconds / 3600;
    minutes = (seconds - (hours * 3600)) / 60;
    
    String output = hours + " hour(s) and " + minutes + " minute(s)";
        
    return output;
  }
  
  public static void main(String[] args) {
	  System.out.println(toTime(3500));
  }
}