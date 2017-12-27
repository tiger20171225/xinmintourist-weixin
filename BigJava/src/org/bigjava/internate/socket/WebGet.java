package org.bigjava.internate.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class WebGet {

	private static final String HOST = "localhost";
	private static final int PORT = 8080;
	
	public static void main(String[] args) throws IOException {
		
		// Build the connection to Server
		Socket client = new Socket(HOST, PORT);
	    
		// Get the stream
		InputStream inputStream = client.getInputStream();
		OutputStream outputStream = client.getOutputStream();
		
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		
		String command = "GET http://localhost:8080/axis/testServlet HTTP/1.1\n\n";
		
		out.print(command);
		out.flush();
		int count = 1;
		//while (in.hasNextLine()) {
			
			//String input = in.nextLine();
			//System.out.println(input);
			//System.out.println(count++);
		//}
		
		client.close();	
	}
}
