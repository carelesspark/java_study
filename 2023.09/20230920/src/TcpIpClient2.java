import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpIpClient2 {

	public static void main(String[] args) {
		// 192.168.0.24

		String serverIP = "192.168.0.24";

		try {
			Socket socket = new Socket(serverIP, 7777); // ���� ó��
			System.out.println("������ ����Ǿ����ϴ�.");
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);

			sender.start();
			receiver.start();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
