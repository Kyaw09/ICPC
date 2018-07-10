package Online_judge;
import java.util.*; 
public class I_Think_IneedaHouseBoat {
    static Scanner input = new Scanner(System.in)  ;
	public static void main(String[] args) {
        int N = input.nextInt() ; 
        float x , y ; 
        for(int i = 1 ; i <=  N ; i++) {
        	  x = input.nextFloat() ; 
        	  y = input.nextFloat() ; 
        	  System.out.println("Property " + N + ":" + "This property will begin eroding in "+"year "+(int)(Math.ceil(Math.PI/100*(x*x+ y*y))));
        }
        System.out.println("END OF OUTPUT");
     }
}
