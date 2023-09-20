import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;	

public class NetWorkTest {

	public static void main(String[] args) {
		URL url = null;
		BufferedReader input = null;
		String address = "https://www.naver.com/index.html";
		String line ="";	// ���� ���� �ҷ��� ���� ����
		
		try {
			url = new URL(address);		// ���� ó�� �ʿ�
			InputStreamReader is = new InputStreamReader(url.openStream()); // openStream�� ����ó�� �ʿ�
			input = new BufferedReader(is);
			
			while((line = input.readLine()) != null) {	// ������ int���� �� -1�̿����� StringŸ���� ��� null���� �������� �޴´�.
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
