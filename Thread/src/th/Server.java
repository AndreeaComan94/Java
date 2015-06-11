package th;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(12345);
		System.out.println("Server:");
		Socket s1 = ss.accept();
		
		
		int a = s1.getInputStream().read();
		System.out.println(a);
		
		int b = s1.getInputStream().read();
		System.out.println(b);
		
		int suma = a+b;
		s1.getOutputStream().write(suma);
	}

}
