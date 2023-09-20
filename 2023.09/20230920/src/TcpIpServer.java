import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpIpServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket(7777); // ����ó�� �ʿ�, 7777 = ��Ʈ ��ȣ
			System.out.println(getTime() + "������ �غ�Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		
		while(true) { // ������ ��� ���ư�����, ���� ����� ���� �� �𸣱� ����
			System.out.println(getTime() + "�����û�� ��ٸ��ϴ�.");
			try {
				Socket socket = serverSocket.accept(); // ����ó�� �ʿ�, ��û�� �������� �ȵ������� ����
				System.out.println(getTime() + socket.getInetAddress() + "�� ���� �����û��"); // ���� ���� ��û�� �ߴ��� �� �� ����
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("[Notice] ������ ȯ���մϴ�.");
				
				dos.close();
				socket.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	
	static String getTime() {	// ���� �ð� ��Ÿ���� �޼ҵ�
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

}
