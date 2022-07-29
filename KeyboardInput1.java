package core_java;
import java.io.*;

public class KeyboardInput1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the number1 ");
    int b1=Integer.parseInt(b.readLine());
    System.out.println("enter the number2 ");
    int b2=Integer.parseInt(b.readLine());
    int sum=b1+b2;
    System.out.println("sum of "+b1+" and "+b2+" is "+sum);
    System.out.println("enter the string ");
    String s=b.readLine();
    System.out.println("entered string is \n"+s);
	}

}
