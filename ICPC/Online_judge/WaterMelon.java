package Online_judge;
import java.util.Scanner;
public class WaterMelon {
   static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
      int w= input.nextInt();
      if(1 <= w && w <= 100) {
    	  if(w == 1) System.out.println("NO");
    	  else {
    		  if(w%2 == 0) {
    			  System.out.println("YES");
    		  }else {
    			  System.out.println("NO");
    		  }
    	  }
      }
	}

}
