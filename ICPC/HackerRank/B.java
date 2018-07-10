package HackerRank;
import java.util.Scanner;
public class B {
   static Scanner input = new Scanner(System.in);
	public static void main(String[] args ) {
	      int T = input.nextInt();
	      if( 1 <=  T && T <= 1000) {
	    	  int[] n = new int[T];
	    	  int i = 0;
	    	  while(i < T) {
	    		   n[i] = input.nextInt();
	    		   i++;
	    	  }
	    	  for(int j=0;j < n.length;j++) {
	    		  System.out.println((long)((Math.pow(2, n[j])-1)%Math.pow(10, 5)));
	    	  }
	      }
   }
}
