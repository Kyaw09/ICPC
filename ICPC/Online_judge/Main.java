package Online_judge;
import java.util.*; 
public class Main {
   private static Scanner input;
public static void main(String[] args) {
	   input = new Scanner(System.in); 
		   int t = 10 ; 
		   while(t > 0) {
			   long n = input.nextInt() ;
			   System.out.println(solve(n));
             t-- ; 
		   }
	   }
   public static long solve(long n ) {
	  long  sum = n/2 + n/3 + n/4 ; 
	  if(sum > n)
		    return solve(n/2) + solve(n/3) + solve(n/4) ; 
	  else 
		  return n ; 
   }
   }
