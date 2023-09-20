import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Sender extends Thread {

	Socket socket;
	DataOutputStream out;
	String name;

	public Sender(Socket socket) {
		super();
		this.socket = socket;

		try {
			out = new DataOutputStream(socket.getOutputStream()); // 예외 처리
			name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		while (out != null) { // out이 null일 때 소켓끼리 끊겼음, while문 종료
			try {
				out.writeUTF(name + sc.nextLine()); // 예외 처리
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
