package core_java;
import java.io.*;
public class ReadFileInFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	String filetype;
	
	
	
    File f=new File("C:\\");
    File files[]=f.listFiles();
    System.out.println("S.no     filetype     filename");
    int i=0;
    for(File x:files)
    {
    	
    	i++;
    	if(x.isFile())
    	{
    		filetype="File  ";
    	}
    	else
    	{
    		filetype="Folder";
    	}
    	System.out.println(i+"     "+filetype+"    "+x);
    }
    
	}

}
