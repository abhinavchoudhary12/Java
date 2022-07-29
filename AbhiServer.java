package core_java;
import java.io.*;
import java.net.*;
public class AbhiServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data=null;
		String line =null;
		try {
			ServerSocket ss=new ServerSocket(6666);
			System.out.println("listening on port 6666.....");
			Socket s=ss.accept();
			while(s!=null){
			System.out.println("connection esteblished on port 6666");
			BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
			BufferedReader b2=new BufferedReader(new InputStreamReader(s.getInputStream()));
			OutputStream os=s.getOutputStream();
			PrintWriter out=new PrintWriter(os,true);
			Boolean check=true;
			while(check)
			{
				
				line=b2.readLine();
				System.out.println("Client: "+line);
	
				if(line.equalsIgnoreCase("bye"))
				{
					check=false;
				}
				System.out.println("<<");
				data=b1.readLine();
				out.println(data);
			}
			s.close();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
