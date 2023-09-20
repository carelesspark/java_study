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
			serverSocket = new ServerSocket(7777); // 예외처리 필요, 7777 = 포트 번호
			System.out.println(getTime() + "서버가 준비되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
		
		while(true) { // 서버는 계속 돌아가야함, 언제 통신이 들어올 지 모르기 때문
			System.out.println(getTime() + "연결요청을 기다립니다.");
			try {
				Socket socket = serverSocket.accept(); // 예외처리 필요, 요청이 들어오는지 안들어오는지 감시
				System.out.println(getTime() + socket.getInetAddress() + "로 부터 연결요청됨"); // 누가 연결 요청을 했는지 알 수 있음
				OutputStream out = socket.getOutputStream();
				DataOutputStream dos = new DataOutputStream(out);
				dos.writeUTF("[Notice] 연결을 환영합니다.");
				
				dos.close();
				socket.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
	
	static String getTime() {	// 현재 시간 나타내는 메소드
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	}

}
