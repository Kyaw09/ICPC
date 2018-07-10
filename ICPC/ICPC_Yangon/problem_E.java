package ICPC_Yangon;
import java.util.*;
public class problem_E {
		static Scanner input = new Scanner(System.in); 
		static String str ; 
		static int T ; 
		public static void main(String[] args) {
		        str = input.nextLine() ; 
		        T = str.charAt(0) - '0'; 
		        //System.out.println(T);
		        shift(); 
		  }
		public static void shift() {
			String s = ""; 
			for(int i= 2 ; i < str.length() ; i++) {
				if(str.charAt(i)==' ')
					s += " "; 
				else if(str.charAt(i) == '#') 
					break ; 
				else if(str.charAt(i) == '?')
					s += "?";
				else {
					int n = 	T+str.charAt(i);
					//System.out.println(n);
					if( n > 'z' )
						s += (char)((n%'z') + 'a' ) ;
					else if(n > 'Z'  && n < 'a')
						s += (char) ((n%'Z')+ 'A'); 
					else if( n > '9'  && n < 'A') 
						 s += (char) ((n%'9') + '0' ); 
				   else 
					     s += (char)(n) ; 		 
					}
				}
			System.out.println(s);
		}
	}
