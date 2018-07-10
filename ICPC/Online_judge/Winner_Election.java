package Online_judge;
import java.util.Scanner;
public class Winner_Election {
   static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
    	int T = input.nextInt();
    	if(1 <= T) {
    		for(int i = 0; i < T; i++) {
    		     int n = input.nextInt();
    		     int r = input.nextInt();
    		     int v = input.nextInt();
    		     if( (1 <= n && n <= 100) || (1 <= r && r <= 9) || (1 <= v && v <= 10000)) {
    		    	 String[] str = new String[n];
    		    	 String[] str1 = new String[v];
    		    	 for(int ii = 0; ii < str.length ; ii++) {
    		    		 str[ii] = input.nextInt() + "" + input.nextLine();
    		    	 }
    		    	 for(int ii = 0 ; ii < str1.length ; ii++) {
    		    		 str1[ii] = input.next();
    		    	 }
    		    	 int[] re = new int[r];
    		    	 for(int ii = 1; ii <= r ; ii++) {
    		    		 for(int iii = 0; iii < str.length ; iii++) {
    		    			  if((str[iii].charAt(0)+"").equals(ii+"")) {re[ii-1]++;}  
    		    		 }
    		    	    for(int iii = 0; iii < str1.length ; iii++) {
    		    	    	for(int iiii = 0 ; iiii < str.length ; iiii++) {
    		    	    		if((str1[iii].charAt(iiii)+"").equals((str1[iii].charAt(iiii+1)+""))) { System.out.println(str1[iii].replaceAll(str1[iii],"#"));break;}
    		    	    	
    		    	    }
    		    	 }
    		    	 }
    		    	 int[] count = new int[str.length];
    		    	 for(int ii = 0; ii < str1.length ; ii++) {
    		    		 for(int iii = 0; iii < str.length ; iii++) {
    		    			 if(str1[ii].charAt(iii) == 'x' ) count[iii]++; 
    		    		 }
    		    	 }
    		    	 for(int ii = 0 ; ii < re.length ; ii++) {
    		    		 int max =count[0];
    		    		 for(int iii = 0 ; iii < re[ii] ; iii++) {
    		    			 if(count[iii] > max) System.out.println(str[iii].substring(1));
    		    			 else if(count[iii] ==max) System.out.println(str[iii].substring(1));
    		    		     }
    		    	 }
    		     }
    		}
    	}
    }
}
