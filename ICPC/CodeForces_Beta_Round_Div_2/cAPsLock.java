package CodeForces_Beta_Round_Div_2;
import java.util.Scanner;
public class cAPsLock {
	static Scanner input = new Scanner(System.in);
     public static void main(String[] args) {
    	 String str = input.next();
         Format(str);
     }
     public static void Format(String str) {
    	 if(Character.isUpperCase(str.charAt(0))){
    		 int u = 0;
    		 int l = 0;
    		 int i = 1;
    		 while(i < str.length()) {
    			 if(Character.isUpperCase(str.charAt(i))) {
    				 u++;
    			 }else {
    				 l++;
    			 }
    			 i++;
    		 }
    		 if(l == str.length()-1) System.out.println(str);
    		 else if(u == str.length()-1) System.out.println(str);
    		 else System.out.println(str.charAt(0)+str.substring(1).toLowerCase());
    	 }else {
    		 int u = 0 ;
    		 int l  = 0;
    		 int i = 1;
    		 while(i < str.length()) {
    			 if(Character.isUpperCase(str.charAt(i))) {
    				 u++;
    			 }else {
    				 l++;
    			 }
    			 i++;
    		 }
    		 if(l == str.length()-1) System.out.println(str);
    		 else if(u == str.length()-1)System.out.println(Character.toUpperCase(str.charAt(0))+str.substring(1).toLowerCase());
    		 else System.out.println(Character.toUpperCase(str.charAt(0))+str.substring(1).toLowerCase());
    	 }
     } 
}
