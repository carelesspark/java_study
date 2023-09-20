import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient {

	public static void main(String[] args) {
		// 192.168.0.24 
		System.out.println("서버에 연결중 입니다. : 192.168.0.24");
		
		try {
			Socket socket = new Socket("192.168.0.24", 7777); 
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버로 부터 받은 메세지 : " + dis.readUTF());
			System.out.println("연결을 종료 합니다.");
			
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
