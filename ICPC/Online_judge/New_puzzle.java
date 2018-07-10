package Online_judge;
import java.util.Scanner;
public class New_puzzle {
	 static Scanner input = new Scanner(System.in);
      public static void main(String[] args) {
    	  int[] A = new int[input.nextInt()];
    	  for(int i = 0;i<A.length;i++) A[i]=i;
    	  int k = input.nextInt();
    	  int s = input.nextInt();
    	  int x = input.nextInt();
    	  int sa = s; 
    	  int count = 0;
    	  while(s != x) {
    		  s += k;
    		  if( s >= A.length) s -= A.length;
    		  count++;
    		  if( s == sa) {
    			  System.out.println("-1");
    			  System.exit(1);
    		  }
    	  }
    	  System.out.println(count);
      }
}
