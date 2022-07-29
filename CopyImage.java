package core_java;
import java.io.*;
public class CopyImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     File f=new File("src\\core_java\\aa.jpg");
     File f1=new File("src\\core_java\\ab.jpg");
     int ch;
     try{
    	 FileInputStream fis=new FileInputStream(f);
         FileOutputStream fos=new FileOutputStream(f1);
         while((ch=fis.read())!=-1)
         {
        	 fos.write(ch);
         }
         fis.close();
         fos.close();
    	 
    	 System.out.println("file created...");
     }catch(Exception e)
     {
    	 e.printStackTrace();
     }
	}

}
