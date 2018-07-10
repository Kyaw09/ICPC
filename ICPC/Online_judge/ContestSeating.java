package Online_judge;
import java.util.Scanner;
public class ContestSeating {
	static Scanner input = new Scanner(System.in);
      public static void main(String[] args) {
    	  int T = input.nextInt();
    	  int x = 1;
    	  while(x <= T) {
    		  int P = input.nextInt();
    		  int M = input.nextInt();
    		  if(1 <= P && P <= 500 || 1 <= M && M <= 500) { 
    	          int[] A = new int[P];
    	          for(int i = 0;  i < A.length ; i++) {
    	        	  A[i] = input.nextInt();
    	          }
    	          int ans = 0;
    	          for(int i = 0 ; i < A.length ; i++) {
    	        	  for(int j = i+1; j < A.length ; j++) {
    	        		  if(A[i] == A[j] && A[i] != 0 && A[j] != 0) {
    	        			  A[j] = 0;ans++;}
    	        	  }
    	          }
    	          System.out.println("Case "+x+":");
                  System.out.println(ans);
    		  }
    		  x++;
      }
}
}
