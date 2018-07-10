package content_1;
import java.util.* ; 
public class Chemistry {
     private static String str ;
     static Scanner input = new Scanner(System.in) ; 
     public static void main(String[] args) {
    	 str = input.nextLine()  ;
    	 String str1 = "" ; 
    	 for(int i = 0 ; i< str.length() ; i++) {
    		 if( str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
    			   i += 2 ; 
    		 }
    		 str1 += str.charAt(i) ; 
    	 }
    	 System.out.println(str1);
     }
}
