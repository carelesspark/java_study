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
			in = new DataInputStream(socket.getInputStream()); // 예외 처리
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Override
	public void run() {
		while(in != null) { // in이 null일 때 소켓끼리 끊겼음, while문 종료
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
