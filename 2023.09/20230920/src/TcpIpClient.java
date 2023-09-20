import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient {

	public static void main(String[] args) {
		// 192.168.0.24 
		System.out.println("������ ������ �Դϴ�. : 192.168.0.24");
		
		try {
			Socket socket = new Socket("192.168.0.24", 7777); 
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("������ ���� ���� �޼��� : " + dis.readUTF());
			System.out.println("������ ���� �մϴ�.");
			
			dis.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
