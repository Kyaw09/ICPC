package Online_judge;
import java.util.Scanner;
public class Count_Down {
	 static Scanner input = new Scanner(System.in);
      public static void main(String[] args) {
    	  int[] A = new int[input.nextInt()];
    	  int s = input.nextInt();
    	  int sum = s;
    	  int sum1 = 0;
    	  for(int i = 0;i<A.length;i++) {
    		  A[i] = input.nextInt();
    		  if(A[i] >= s) {
    			  A[i] = 0;
    		  }
    	  }
          while(sum != sum1) {
        	  sum1 = 0;
        	  for(int i = 0;i<A.length;i++) {
        		  if(A[i] != 0)
        		  sum1 += s - A[i];
        	  }
        	  s--;
          }
          System.out.println(s+1);
      }
}
