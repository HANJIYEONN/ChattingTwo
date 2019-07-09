package CharTwo;

import java.net.ServerSocket;
import java.net.Socket;

public class CharTwo {

	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
		
		ss = new ServerSocket(7019);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("서버서버");
		
		while (true) {
			try {
				Socket s =  ss.accept();
				
				ServerThread st = new ServerThread(s) ;
				Thread t = new Thread(st);
				t.start();
			}catch (Exception e) {
				e.printStackTrace();
		}
	} 	
}
}
