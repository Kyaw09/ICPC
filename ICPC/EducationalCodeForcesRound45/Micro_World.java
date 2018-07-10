package EducationalCodeForcesRound45;
import java.util.Scanner ;
public class Micro_World {
	  static Scanner input = new Scanner(System.in);
      public static void main(String[] args) {
    	  int n = input.nextInt();
    	  int K = input.nextInt();
    	  if((1<=n && n <=2*Math.pow(10, 5))  &&( 1<=K && K <=Math.pow(10, 6))) {
    	  int[] A = new int[n];
    	  int i =0;
    	  while(i < n) {
    		  A[i] = input.nextInt();
    		  i++;
    	  }
    	 int iiii = 0;
    	  for(int ii = 0 ; ii < A.length;ii++) {
    		  for(int iii = 0 ; iii < A.length;iii++) {
    			  if(A[iii] > A[ii] && A[iii] <= A[ii] + K) {
    				  if(A[ii] != 0) {
    					  iiii++;
    				  }
    				  A[ii] = 0;
    			  }
    		  }
    	  }
    	  System.out.println(A.length - iiii);
      }
      }
}
