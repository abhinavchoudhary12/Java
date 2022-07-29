package core_java;
import java.io.*;
public class CopyLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    File f=new File("src\\core_java\\Generics.java");
    File f1=new File("src\\core_java\\filecreated.txt");
    String line=null;
    try {
    	BufferedReader bf=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
    	BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f1)));
    	while((line=bf.readLine())!=null)
    	{
    		bw.write(line);
    		bw.write("\n");
    	}
    	System.out.println("file created....");
    	bf.close();
    	bw.close();
    }catch(Exception e)
    {
    	e.printStackTrace();
    }
	}

}
