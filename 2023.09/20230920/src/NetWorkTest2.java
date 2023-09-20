import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class NetWorkTest2 {

	public static void main(String[] args) {
		URL url = null;
		InputStream in = null;
		FileOutputStream out = null;
		String address = "다운로드 할 수 있는 파일이 있는 주소";	// 파일을 받아오는 방법

		int ch = 0;
		 
		try {
			url = new URL(address);
			in = url.openStream();
			out = new FileOutputStream("down_git.zip");

			while ((ch = in.read()) != -1) {
				out.write(ch);
			}
			in.close();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		// 인증서 오류로 인해서 접근이 불가한 듯, 이러한 형식으로 파일을 원격으로 받아올 수 있다는라는 점으로 알아두면 좋을 것 같음
	}

}
