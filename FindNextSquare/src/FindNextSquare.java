public class FindNextSquare {
	
  public static long numberFun(long sq) {
	    //Converting long to int.
	    double input = (double)sq;
	    //Finding the square root of input and converting to int.
	    int sqrt = (int)Math.sqrt(input);
	    //Checking if input is itself a perfect square.
	    boolean perfectSq = (Math.sqrt(input) % 1) == 0; 
	    
	    if (perfectSq == true) {
	      //Finding result by increasing the sqrt with 1 and squaring it.
	    int result = (sqrt + 1) * (sqrt + 1); 
	    
	    return result;
	    }
	    
	    return -1;
  }
}