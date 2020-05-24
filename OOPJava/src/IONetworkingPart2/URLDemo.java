package IONetworkingPart2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLDemo {

	public static void main(String args[]) {
		
		/** The website will be printed out in HTML format.  */
		try {
			URL website = new URL("https://www.oracle.com/corporate/careers/");
			Scanner read = new Scanner(new InputStreamReader(website.openStream()));
			while (read.hasNextLine()) {
				String line = read.nextLine();
				System.out.println(line);
			}
		} 
		catch (MalformedURLException e) {
			System.out.println("Cannot reach website.  ");
		}
		catch (IOException e) {
			System.out.println("I/O error.  ");
		}
		
		
	}
	
}
