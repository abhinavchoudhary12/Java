package core_java;
import java.util.*;
import java.io.*;
public class CreateFileWithInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    String s1=null;
    File f=new File("src\\core_java\\inputfile.txt");
    BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
    Boolean check=true;
    while(check)
    {
    	
    s1=s.nextLine();
    
    if(s1.contains("exit"))
    {
    	check=false;
    	break;
    }
    bf.write(s1);
    bf.write("\n");
  
    }
    System.out.println("file created..");
    bf.close();

}
}