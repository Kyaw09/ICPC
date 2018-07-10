package HackerRank;
import java.util.Scanner;
public class A {
	static Scanner input = new Scanner(System.in);
    public static void main(String[] main) {
    	int str_num = input.nextInt();
    	String[] strings = new String[str_num];
    	for(int i=0;i < strings.length;i++) strings[i] = input.next();
    	int que_num = input.nextInt();
    	String[] queries = new String[que_num];
    	for(int i=0;i<queries.length;i++) queries[i] = input.next();
       int[] res = Match(strings, queries);
       for(int i = 0; i < res.length ; i++) System.out.println(res[i]);
    }
    public static int[] Match(String[] strings,String[] queries) {
    	int num ;
      	int[] res = new int[queries.length];
    	for(int i = 0 ; i < queries.length ; i++) {
    		num = 0;
    		for(int ii = 0 ; ii< strings.length;ii++) {
    			if(queries[i].equals(strings[ii])){
    				num++;
    			}
    		}
    		res[i]  = num;
    	}
	    return res;
    }
}
