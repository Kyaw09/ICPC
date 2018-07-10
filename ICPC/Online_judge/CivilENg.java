package Online_judge;
import java.util.Scanner;
public class CivilENg {
	static Scanner input = new Scanner(System.in);
     public static void main(String[] args) {
    	 int T = input.nextInt();
    	 if(1 <= T && T <= 10000) {
    		 int i = 1;
    		 while(T > 0){
    			 int m = input.nextInt();
    			 int n = input.nextInt();
    			 int[] ma = new int[m+1];
    			 ma[0] = 0;
    			 int[] oblong = new int[n];
    			 int[] index = new int[n];
    		    for(int ii = 1; ii < ma.length ; ii++) {
    		    	ma[ii] = input.nextInt();
    		    }
    		    for(int j = 0 ; j < oblong.length ; j++) {
    		    	oblong[j] = (input.nextInt()*input.nextInt()*input.nextInt());
    		    	index[j] = input.nextInt();
    		    }
    		    int ans = 0;
    		    for(int j = 0 ; j < oblong.length ; j++) {
    		    	for(int jj = 1 ; jj < ma.length ; jj++) {
    		    		if(index[j] == jj) {
    		    			oblong[j] *= ma[jj];
    		    		}
    		    	}
    		    	ans += oblong[j];
    		    }
    		    System.out.println("Case "+i+":"+ans);
    		    i++;
    		    T--;
    		 }
    	 }
     }
}
