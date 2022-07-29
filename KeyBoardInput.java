package core_java;
import java.util.*;
public class KeyBoardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     System.out.println("enter the number1");
     int x=s.nextInt();
     System.out.println("enter the number2");
     
     int y=s.nextInt();
     int sum=x+y;
     System.out.println("sum of "+x+" and "+y+" is "+sum);
     
     System.out.println("enter the string ");
     s.nextLine();
     String s1=s.nextLine();
     System.out.println("String u enterd is \n"+s1);
     
    		 
	}

}
