package Online_judge;
import java.util.*; 
public class Galactik_Football {
    private int[] id , az ;
    private static  int N,M ; 
    private List<String> str2 = new ArrayList<>() ; 
    static Scanner input = new Scanner(System.in) ; 
    public Galactik_Football(int N) {
         id = new int[N+1] ; 
         az = new int[N+1] ; 
    	for(int i = 0 ; i < id.length ; i++) {id[i] = i ; az[i] = 1 ; str2.add(id[i]+"") ;  }
    }
    public int root(int p ) {
    	while( p != id[p] ) p = id[p] ; 
    	return p ; 
    }
    public boolean connected(int  p , int q) {
    	return root(p) == root(q) ; 
    }
    public void union(int p , int q ) {
    	int i  = root(p) ; 
    	int j = root(q) ; 
    	if(i == j) return ; 
    	else if(az[i] < az[j]) { id[i] = j ; az[j] += az[i] ; }
    	else {id[j] = i ; az[i] += az[j] ; }
    }
    public static void main(String[] arg) {
    	 N = input.nextInt() ; 
        M = input.nextInt() ; 
    	if(1 <= N && N <= 100000 &&   0 <= M && M <= 1000000) {
    	int[] C = new int[N+1] ; 
    		String str  = "" ; 
    		List<String> str1 = new ArrayList<>() ; 
    	Galactik_Football G = new Galactik_Football(N) ; 
    	int A , B ; 
    	int i = 0 , D= 0 ; 
    	while(M != 0) {
    		A = input.nextInt() ;
    		B = input.nextInt() ; 
    		if( A > 0 && A <= N && B > 0 && A <= N && A != B ) {
    			str1.add("0") ; 
    	    if(i == 0) {G.union(A, B); D = A ;  i++ ; str += D + "" ; str1.add(A +"") ; str1.add(B+"") ; }
    	    else {
    	    	G.union(A, B);
    	    	str1.add(A+"");
    	    	str1.add(B+""); 
    	    	if(!G.connected(G.root(D), A)) { i = 0 ; }
    	    }
    		}
    		M-- ;  
    	}
    	G.str2.removeAll(str1) ; 
    	for(String s : G.str2) {
    		str += s ; 
    	}
    	int min_amount = 0 , pos = 0 ;   
     	for(int a = 1 ; a < C.length ; a++) {
   		C[a] = input.nextInt() ;
   		if(C[a] == -1) pos = -1 ; 
   		} 
     	for(int b =  1 ; b < str.length() ; b++) {
     		min_amount += C[G.root(str.charAt(b)-'0')] + C[G.root(str.charAt(0) - '0')] ; 
     	}
     	if(pos == -1) System.out.println(-1);
     	else if(G.az[G.root(1)] == N) {
        	System.out.println(0);
        }else {
        	System.out.println(min_amount);
        }
    	}
    }
  }

