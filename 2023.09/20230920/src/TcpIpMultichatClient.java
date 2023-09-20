import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpIpMultichatClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵� �Է� >> ");
		String name = sc.nextLine();
		// 192.168.0.24

		String serverIP = "192.168.0.24";
		try {
			Socket socket = new Socket(serverIP, 7777);
			System.out.println("������ ����Ǿ����ϴ�.");
			
			Thread sender = new Thread(new ClientSender(socket, name));
			Thread receiver = new Thread(new ClientReceiver(socket));
			
			sender.start();
			receiver.start();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} // main �� �κ�

	static class ClientSender extends Thread {

		Socket socket;
		DataOutputStream dos;
		String name;

		public ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
				dos = new DataOutputStream(socket.getOutputStream());
				this.name = "[" + socket.getInetAddress() + ":" + socket.getPort() + "]";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);

			try {
				if (dos != null) {
					dos.writeUTF(name);
				}

				while (dos != null) {
					dos.writeUTF("[" + name + "]" + sc.nextLine());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} // ClientSender �� �κ�

	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream dis;

		public ClientReceiver(Socket socket) {
			this.socket = socket;

			try {
				dis = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			while (dis != null) {
				try {
					System.out.println(dis.readUTF());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
