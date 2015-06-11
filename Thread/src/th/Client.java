package th;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException,
			IOException {
		// TODO Auto-generated method stub

		Socket s2 = new Socket("localhost", 12345);
		System.out.println("client: ");
		s2.getOutputStream().write(5);
		s2.getOutputStream().write(15);
		System.out.println("suma este: "+s2.getInputStream().read());
	}

}
