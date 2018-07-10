package Online_judge;
import java.util.Scanner ; 
public class CNOTE {
	static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
         	int T = input.nextInt() ;
         	if(1 <= T && T <= Math.pow(10,5)){
            while(T>0) {
         		int X = input.nextInt();
         		int Y = input.nextInt();
         		int K = input.nextInt();
         		int N=input.nextInt();
         		int[] Num_P = new int[N];
         		int[] C = new int[N];
         		if(Y < X && 1<=Y && Y <= Math.pow(10,3) && X <= Math.pow(10, 3) && 1 <= K && K <= Math.pow(10,3)&& 1 <= N && N <= Math.pow(10,5)) {
                    int i =0;
         			for( i = 0 ; i < Num_P.length ; i++) {
         				Num_P[i] = input.nextInt() ;
         				C[i] = input.nextInt();
         				if(C[i] <= K && Num_P[i] >= (X-Y)) {
         						System.out.println("LuckyChef");break;
         					}
         				}
         			if(i == Num_P.length) {
         				System.out.println("UnluckyChef");
         			}
         		}
            	T--;
         	}
    }
}
}
