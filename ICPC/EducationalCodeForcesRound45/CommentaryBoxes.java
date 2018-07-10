package EducationalCodeForcesRound45;
import java.util.Scanner;
public class CommentaryBoxes {
	static Scanner input = new Scanner(System.in);
     public static void main(String[]  args0) {
    	 int  n = input.nextInt();
    	 int m = input.nextInt();
    	 int a = input.nextInt();
    	 int b = input.nextInt();
    	 if(1<=n&&m<=Math.pow(10,12)&&1<=a&&b<=100) {
    		 if(m == 0) {System.out.println(n);System.exit(0);}
    		 else if(n%m == 0) {
    		 System.out.println(0);
    	 }else {
    		 int result1,result2;
    		 if(n / m == 0) {
    			 result1 = (n%m)*b;
    			  result2 = (m-(n%m))*a;
    		 }else {
    	     result1 = (n%m) * b;
    	     result2 = ((m * 2) - n)*a;
    	     }
    	 if(result1 > result2) System.out.println(result2);
    	 else System.out.println(result1);
    	 }
     }
     }
}
