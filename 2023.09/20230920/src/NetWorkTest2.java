import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class NetWorkTest2 {

	public static void main(String[] args) {
		URL url = null;
		InputStream in = null;
		FileOutputStream out = null;
		String address = "�ٿ�ε� �� �� �ִ� ������ �ִ� �ּ�";	// ������ �޾ƿ��� ���

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

		
		// ������ ������ ���ؼ� ������ �Ұ��� ��, �̷��� �������� ������ �������� �޾ƿ� �� �ִٴ¶�� ������ �˾Ƶθ� ���� �� ����
	}

}
