package CodeForces_Beta_Round_Div_2;
import java.util.Scanner;
public class CapLock
{
	static Scanner in = new Scanner(System.in);
    public static void main(String args[])
    {
        String x = in.next();
        StringBuilder buf = new StringBuilder(x);
        if(x.equals(buf.toString().toUpperCase()))
            System.out.println(buf.toString().toLowerCase());
        else if(buf.substring(0,1).equals(buf.substring(0,1).toLowerCase()))
        {
            if(buf.substring(1).equals(buf.substring(1).toUpperCase()))
                System.out.println(buf.substring(0, 1).toUpperCase()+buf.substring(1).toLowerCase());
            else
                System.out.println(x);
        }
        else
            System.out.println(x);
    }
}
