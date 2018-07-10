package ICPC_Yangon;
import java.util.Scanner;
public class ProblemB {
	static Scanner input = new Scanner(System.in);
     public static void main(String[] args) {
    	 int T = input.nextInt();
    	 if(1 <= T && T <= 20) {
    		 for(int i = 0; i <T; i++) {
    			 String str = input.next();
    			 convert(str, "",i);
    		 }
    	 }
     }
     public static void convert(String str,String ans_str,int i) {
    	 if(str.length() == 0) { System.out.println("Case "+(i+1)+":"+ans_str);}
    	 else if(str.substring(0,2).equals("10")) { ans_str += "0";convert(str.substring(2),ans_str,i);}
    	 else if(str.substring(0,3).equals("011")) {ans_str +="1" ;convert(str.substring(3),ans_str,i);}
    	 else if(str.substring(0,3).equals("110")) {ans_str += "2"; convert(str.substring(3),ans_str,i);}
    	 else if(str.substring(0,4).equals("0010")) {ans_str += "3"; convert(str.substring(4),ans_str,i);}
    	 else if(str.substring(0,4).equals("1110")) {ans_str += "4"; convert(str.substring(4),ans_str,i);}
    	 else if(str.substring(0,4).equals("1111")) {ans_str += "5"; convert(str.substring(4),ans_str,i);}
    	 else if(str.substring(0,5).equals("00000")) {ans_str += "6"; convert(str.substring(5),ans_str,i);}
    	 else if(str.substring(0,5).equals("00001")) {ans_str += "7"; convert(str.substring(5),ans_str,i);}
     }
}
