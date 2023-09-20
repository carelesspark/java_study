import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Receiver extends Thread {

	Socket socket;
	DataInputStream in;

	public Receiver(Socket socket) {
		super();
		this.socket = socket;

		try {
			in = new DataInputStream(socket.getInputStream()); // ���� ó��
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Override
	public void run() {
		while(in != null) { // in�� null�� �� ���ϳ��� ������, while�� ����
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
