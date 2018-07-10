package Online_judge;
import java.util.* ; 
public class Little_ElephantandCandies {
    static Scanner input = new Scanner(System.in) ;   
	public static void main(String[] args) {
    	  int T = input.nextInt() ; 
    	  if( T >= 1 && T <= 1000) {
    		  while( T != 0) {
    		  int N = input.nextInt() ; 
    		  int C = input.nextInt() ; 
    		  if(N <= 100 && N>= 1 && C <= Math.pow(10, 9) &&C>= 1 ) {
    			  int[] A = new int[N] ; 
    			  for( int k = 0 ; k < A.length ; k++) {A[k] = input.nextInt() ;  C -= A[k] ; }
    			  if( C >= 0 ) System.out.println("Yes");
    			  else System.out.println("No");
    		  }
    		  T--; 
    	   }
    	 }      
    }
}
