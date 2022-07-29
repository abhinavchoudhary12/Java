package core_java;

import java.io.*;;


public class SerializationReadObject {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		  String s;
			File f=new File("src\\core_java\\serialization.txt");
			FileInputStream fi=new FileInputStream(f);
			ObjectInputStream is=new ObjectInputStream(fi);
			s=(String)is.readObject();
			System.out.println("reading object\n"+s);
			is.close();
		 
	}

}
