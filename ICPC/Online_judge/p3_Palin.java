package Online_judge;
import java.util.Scanner;
public class p3_Palin {
   static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	   StringBuilder str = new StringBuilder(input.next());
	   String s = "";
	   String rs = "";
	   int result = 0;
	   for(int i = 0,j = str.length()-1 ; i < str.length() ; i++,j--) {
		 s += str.charAt(i);
		 rs += str.charAt(j);
		 if(s.length() != 1 && rs.length() != 1) {
			 if(s.charAt(0) != '0' && Integer.parseInt(s) % 3 == 0) { System.out.println(s);result++;}
			 if(rs.charAt(0) != '0' && Integer.parseInt(rs) % 3 == 0) {System.out.println(rs);result++;}
		 }
	   }
	   System.out.println(result);
   }
}
