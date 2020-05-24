package IONetworkingPart1;

import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/** I am suppose to run SocketServer first, then SocketClient.  */
public class SocketClient {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String s;
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		
		try {
			/** Connect to server on same machine, port 6789.  */
			Socket clientSocket = new Socket("localhost", 6789);
			/** Set up streams to send / receive data.  */
			inputStream = new Scanner(new InputStreamReader(clientSocket.getInputStream()));
			outputStream = new PrintWriter(new DataOutputStream(clientSocket.getOutputStream()));
			
			/** Write "Java" and send it to the server.  It will be received by server later.  */
			outputStream.println("Java");

			/** Send data to the stream.  */
			outputStream.flush();
			
			/** Reads everything from the server until no more lines and output it to the screen.  */
			while (inputStream.hasNextLine()) {
				s = inputStream.nextLine();
				System.out.println(s);
			}
			inputStream.close();
			outputStream.close();
		}
		
		catch (Exception e) {
			// If any exception occurs, display it.  
			System.out.println("Error " + e);
		}
	}
	
}
