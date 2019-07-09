package CharTwo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
	public Client() {
		try {

			Socket s = new Socket("192.168.0.100", 7109);

			InputStream is = System.in;
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);

			OutputStream os = s.getOutputStream();
			PrintWriter out = new PrintWriter(os, true);
			String data = br.readLine();

			while (data != null) {
				out.println(data);
				data = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
