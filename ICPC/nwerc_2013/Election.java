package nwerc_2013;
import java.util.* ; 
public class Election {
       private  String[] str ; 
       private  int[] n ; 
       private static Set<String> m = new HashSet<>() ; 
       static Scanner input = new Scanner(System.in) ; 
       public static void main(String[] args) {
    	   Election e = new Election() ;   
    	   int num = input.nextInt() ; 
    	    e. str = new String[num] ; 
    	     for(int i = 0 ; i < e.str.length ; i++) {
    	    	 e.str[i] = input.next() ;
    	    	 m.add(e.str[i]);
    	     }
    	     e.n = new int[m.size()] ;
    	     List<String> L = new ArrayList<>(m) ;
    	     int max = 0 , ma = 0;  
    	     for(int i = 0; i < L.size() ; i++) {
    	    	 e.n[i] = 0 ; 
    	    	 for(int  ii = 0 ; ii < e.str.length ; ii++) {
    	    		 if(L.get(i).equals(e.str[ii]))e.n[i]++ ;
//	    		 System.out.println(L.get(i) + " = " + e.str[ii]);
//    	    	 System.out.println(e.n[i]);
    	    	 }
    	    	 if(i == 0) { max = e.n[i] ; ma = i ; } 
    	    	 else if( max < e.n[i]) {max = e.n[i]; ma = i ; }  
    	    	 else if(max == e.n[i]) { System.out.println("reelection"); System.exit(1);}
    	     }
    	     System.out.println(L.get(ma));
       }
}
