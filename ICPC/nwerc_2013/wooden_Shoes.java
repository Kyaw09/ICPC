package nwerc_2013;
import java.util.* ; 
public class wooden_Shoes {
    static String str ; 
	static Scanner input = new Scanner(System.in);
	static int R , L ; 
	public static void main(String[] args) {
        str = input.next();
       // R = 0; 
         //L = 0 ; 
        int[] n = new int[2] ; 
        if(str.length() <= 500 && str.length() >0 ) {
        	   for(int i = 0 ; i < str.length() ; i++) {
        		   if( str.charAt(i) == 'R' ) 
        			    n[0]++ ; 
        		  else if(str.charAt(i) == 'L') 
        			   n[1]++ ; 
        	   }
        	   if( n[0] == n[1]  && str.length() == n[0] + n[1])
        		   System.out.println("ok");
        	   else 
        		    System.out.println("missing");
        }
    }
}
