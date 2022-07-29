package core_java;
import java.net.*;
import java.io.*;
public class UrlWebsiteScraping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String line=null;
		try {
		File f=new File("src\\core_java\\kiet.html");
		URL u=new URL("https://www.kiet.edu/");
		InputStream is=u.openStream();
		BufferedReader bf=new BufferedReader(new InputStreamReader(is));
		FileWriter fw=new FileWriter(f);
		
		while((line=bf.readLine())!=null)
		{
			fw.write(line);
		}
		System.out.println("file created...");
		fw.close();
		bf.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
