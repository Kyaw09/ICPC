package q2010_codeforces_beta_round;
import java.util.Scanner;
public class Theatre_square {
	  static Scanner input = new Scanner(System.in);
      public static void main(String[] args) {
    	  int n = input.nextInt();
    	  int m = input.nextInt();
    	  int a = input.nextInt();
    	  if(n >= 1 && m >= 1 && a <= Math.pow(10,9)) {
    	         System.out.println(Math.round((Math.ceil(n/(double)a)) *Math.round(Math.ceil(m/(double)a))));
    	  }
      }
}
