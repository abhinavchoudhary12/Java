package core_java;
import java.net.*;
import java.io.*;
public class AbhiClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line=null;
		String data=null;
     try {
		Socket s=new Socket("localhost",6666);
		while(s!=null)
		{
			System.out.println("Connection established on 6666...");
			BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
			BufferedReader b2=new BufferedReader(new InputStreamReader(s.getInputStream()));
			OutputStream os=s.getOutputStream();
			PrintWriter out=new PrintWriter(os,true);
			Boolean check=true;
			while(check)
			{
				System.out.println("<<");
				data=b1.readLine();
				out.println(data);
				line=b2.readLine();
				System.out.println("Server: "+line);
				if(line.equalsIgnoreCase("bye"))
				{
					check=false;
				}
				
			}
			s.close();
			
			
		}
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
     
	}

}
