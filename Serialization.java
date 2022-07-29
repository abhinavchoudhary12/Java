package core_java;
import java.io.*;
public class Serialization {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      String s=new String("hello i am an String");
		File f=new File("src\\core_java\\serialization.txt");
		FileOutputStream fr=new FileOutputStream(f);
		ObjectOutputStream os=new ObjectOutputStream(fr);
		os.writeObject(s);
		System.out.println("file created...");
		os.close();
	 
	}

}
