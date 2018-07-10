package Online_judge;
import java.util.Scanner;
import java.util.Stack;
public class Longest_valid_Parentheses {
   static Scanner input =new Scanner(System.in);
	public static void main(String[] args) {
        int T = input.nextInt();
        if(1 <= T && T <= 500) {
        	while(T > 0) {
        		String str = input.next();
        		Stack<String> s = new Stack<String>();
        		s.add("");
        		if( 1 <= str.length() && str.length() <= 10000) {
        			int count = 0;
        			for(int i = 0 ; i < str.length() ; i++) {
        				    if(str.charAt(i) == '(') s.add(")");
        				    else if(str.charAt(i) == ')') {
        				    	  if(s.peek().equals(str.charAt(i)+"")) {s.pop(); count += 2;}
        				}
        			}
        			System.out.println(s);
        			System.out.println(count);
        		}
        		s.removeAll(s);
        		T--;
        	}
        }
	}

}
