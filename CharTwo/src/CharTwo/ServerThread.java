package CharTwo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerThread implements Runnable{
	private Socket s;
	
	public ServerThread(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		try {
			InputStream is = s.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			
			String data = br.readLine();
			
			while (data != null ) {
				System.out.println(data);
				data = br.readLine();
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
