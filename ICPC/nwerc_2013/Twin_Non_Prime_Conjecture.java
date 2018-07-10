package nwerc_2013;
import java.util.*; 
public class Twin_Non_Prime_Conjecture {
      static Scanner input = new Scanner(System.in) ; 
      public static void main(String[] args) {
    	  int z = input.nextInt() ; 
    	  if(!isprime(z)) {if(!isprime(z+2)) System.out.println(z);} 
    	  else {
    	while(isprime(z)) {
    	  while(isprime(z)) z++ ; 
    	  if(!isprime(z+2)) System.out.println(z);}
    	  z++;
    	  }
      }
      public static boolean isprime(int z) {
    	  if(z <= 3) return true ; 
    	  if(z % 2 == 0 || z% 3 == 0) return false;
    	  for(int i = 5 ; i*i <= z ; i += 6) {
    		  if(z % i == 0 || z % i+2 == 0) return false;
    	  }
    	  return true ; 
      }
}
