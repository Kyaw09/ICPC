package Online_judge;
import java.io.*;
public class Buffered {
	static BufferedReader in ;
   public static void main(String[] args) throws IOException {
	   in = new BufferedReader(new InputStreamReader(System.in));
	  int N = in.read();
	  String[] A = new String[N/2];
	  String[][] c= new String[N/2][2];
	  for(int i = 0 ; i < A.length ; i++) {
		  A[i] = in.readLine();
		  c[i] = A[i].split(" ");
	}
}
}
