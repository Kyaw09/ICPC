package Online_judge;
import java.util.Scanner;
import java.util.Stack;
public class Balanced_Brackets {
    static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
    	  int T = input.nextInt();
    	  if(1 <= T && T <= Math.pow(10, 3)) {
    		  while(T > 0) {
    			  String str = input.next();
    			  if(1 <= str.length() && str.length() <= Math.pow(10, 3)){
    			  Stack<String> left = new Stack<>();
    			  left.add("");
    			  int n=0;
    			  for(int i=0;i<str.length();i++) {
    				  if(str.charAt(i) == '{') left.add("}");
    				  else if(str.charAt(i)== '[') left.add("]");
    				  else if(str.charAt(i) == '(') left.add(")");
    				  else if(str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')') {
    					  if((str.charAt(i)+"").equals(left.peek())) {left.pop();n++;}
    					  else {n = 0;break;}
    				  }
    			  }
    			  if(n != 0 && left.peek().equals("")) System.out.println("YES");
    			  else System.out.println("NO");
    			  }
    			  T--;
    		  }
    	  }
      }
}
