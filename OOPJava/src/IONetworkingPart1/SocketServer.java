package IONetworkingPart1;

import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/** I am suppose to run SocketServer first, then SocketClient.  */
public class SocketServer {

	public static void main(String args[]) {

		String s;
		Scanner inputStream = null;
		PrintWriter outputStream = null;
		ServerSocket serverSocket = null;

		try {
			
			/**
			 * Wait for connection on port 6789. I can change the port number from anywhere
			 * from 0 to 65535.  If 6789 is already used once, I have to run SocketClient 
			 * again to reset it, the other solution is to change the number of 6789.  
			 */
			System.out.println("Waiting for a connection.  ");
			serverSocket = new ServerSocket(6789); 
			Socket socket = serverSocket.accept();
			/** Connection made, set up streams.  */
			inputStream = new Scanner(new InputStreamReader(socket.getInputStream()));
			outputStream = new PrintWriter(new DataOutputStream(socket.getOutputStream()));
			
			/** s is supposed to be "Java".  */
			s = inputStream.nextLine();
			/** Output text to the client.  */
			outputStream.println("Well, ");
			outputStream.println(s + " is fine programming language!  ");
			outputStream.flush();
			System.out.println("Closing connection from " + s);
			inputStream.close();
			outputStream.close();
			
		}
		
		catch (Exception e) {
			/** If any exception occurs, display it.  */
			System.out.println("Error " + e);
		}
		
	}
	
}
