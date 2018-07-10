package USP_freshman_Contest;
import java.util.Scanner;
public class ProblemA {
	static Scanner input = new Scanner(System.in);
      public static void main(String[] args) {
    	  long N = input.nextLong();
    	  if(2 <= N && N <= Math.pow(30, 9)) {
    		  long ans  = 1;
    	      long i = 2; 
    		  while(i <= N) {
    	    	   ans += i - 1;
    	    	  i++;
    	      }
    	    System.out.println(ans);
    	  }
      }
}
