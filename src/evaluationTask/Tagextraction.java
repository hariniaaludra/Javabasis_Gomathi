package evaluationTask;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import java.io.InputStreamReader;
import java.net.URL;

public class Tagextraction {
	public static void main(String[] args) throws Throwable {
		
		try {
			URL url = new URL(
	                "file:///D:/gomathi/index.html");
	 
	            // Reading the HTML content from the .HTML File
	            BufferedReader br = new BufferedReader(
	                new InputStreamReader(url.openStream()));
			
			String value;
			while((value=br.readLine())!=null) {
			System.out.println(value);	
			}
			br.close();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
}

