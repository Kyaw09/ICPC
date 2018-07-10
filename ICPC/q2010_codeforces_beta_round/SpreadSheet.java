package q2010_codeforces_beta_round;
import java.util.Scanner;
public class SpreadSheet {
	static Scanner input = new Scanner(System.in);
      public static void main(String[] args) {
    	  int N = input.nextInt();
          while(N > 0) {
        	  String str = input.next();
        	  String R= "";
        	  String C = "";
        	  if(str.charAt(0) == 'R' && Character.isDigit(str.charAt(1))) {
        		  int i = 1;
        		  while(str.charAt(i) != 'C') {
        			 R +=  str.charAt(i);
        			 i++;
        		 }
        		  i++;
        		  while(i < str.length()) {
        			  C += str.charAt(i);
        			  i++;
        		  }
                  System.out.println(converted(C)+ "" + R);
        	  }else {
        		  int ii = 0;
        		  while(!Character.isDigit(str.charAt(ii))) {
        			  C += str.charAt(ii);
        			  ii++;
        		  }
        		  while(ii < str.length()) {
        			  R += str.charAt(ii);
        			  ii++;
        		  }
        		  System.out.println("R"+R+"C"+converted(C));
        //		  System.out.println(R + "  " + C);
        	  }
        	  N--;
          }
      }
      public static String converted(String C) {
    	  String Con = "";
    	  if(Character.isDigit(C.charAt(0))) {
    		  int D = Integer.parseInt(C);
    		  Con += (char) ('A' + ((D / 26) - 1));
    		  Con += (char) ('A' + ((D % 26) -1));
    	  }else if(Character.isLetter(C.charAt(0))) {
    		  Con += (((C.charAt(0)-'A')+1)*26) + ((C.charAt(1)-'A')+1);
    	  }
    	  return Con;
      }
}
