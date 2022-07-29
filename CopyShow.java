package core_java;

import java.io.*;

public class CopyShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int ch;
	 File f=new File("src\\core_java\\Const.java");
     try {
     FileReader fr=new FileReader(f);
     while((ch=fr.read())!=-1)
     {
    	 System.out.print((char)ch);
     }
     fr.close();
	}catch(Exception e)
     {
		e.printStackTrace();
     }
	}
}
