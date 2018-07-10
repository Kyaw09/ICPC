package Online_judge;
import java.util.Scanner;
public class Container_with_most_water {
      static Scanner input = new Scanner(System.in);
      public static void main(String[] args) {
    	  int T = input.nextInt();
    	  if( 1 <= T && T <= 100) {
    	 for(int j = 0; j < T ; j++) {
    		  int N = input.nextInt();
    		  if( 1 <= N && N <= 50) {
    			  int[] A = new int[N];
    			  int max = 0;
    			  for(int i = 0 ; i < A.length; i++) {
    				  A[i] = input.nextInt();
    			}
    			 for(int i = 0; i < A.length ; i++) {
    				 for(int ii = i ; ii < A.length ; ii++) {
    					 if(i == 0 && ii == 0) {
    						 if(A[i] < A[ii])
    						 max = A[i] *(ii-i);
    						 else if(A[ii] < A[i])
    							 max = A[ii]*(ii-i);}
    					 else {
    						 int area =0;
    						 if(A[i] < A[ii])
        						area = A[i] *(ii-i);
        						 else if(A[ii] < A[i])
        							area = A[ii]*(ii-i);
    						 if(area> max) max = area;
    					 }
    				 }
    			 }
    		   System.out.println(max);
    		  }
    	  }
    }
  }
}

