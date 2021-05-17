import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class timeConverterTest {
  
    @Test
    public void fixedTests() {
        assertEquals("1 hour(s) and 0 minute(s)", timeConverter.toTime(3600));
        assertEquals("1 hour(s) and 0 minute(s)", timeConverter.toTime(3601));  
        assertEquals("0 hour(s) and 58 minute(s)", timeConverter.toTime(3500));
        assertEquals("89 hour(s) and 51 minute(s)", timeConverter.toTime(323500));
        assertEquals("0 hour(s) and 0 minute(s)", timeConverter.toTime(0));
    }
  
    private static String Solution(int seconds)
    {
      return String.format("%d hour(s) and %d minute(s)", seconds / 3600, seconds % 3600 / 60);
    }
  
    @Test
    public void RandomTest(){
      
      Random r = new Random();
      
      for(int i = 0; i < 100; i++){
        int num = r.nextInt(999999);
        String exp = Solution(num);
        assertEquals("Should work when seconds = " + num, exp, timeConverter.toTime(num));
      }
    }   
}