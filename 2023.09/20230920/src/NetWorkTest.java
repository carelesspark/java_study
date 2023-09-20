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
		String line ="";	// 한줄 한줄 불러와 값을 저장
		
		try {
			url = new URL(address);		// 예외 처리 필요
			InputStreamReader is = new InputStreamReader(url.openStream()); // openStream도 예외처리 필요
			input = new BufferedReader(is);
			
			while((line = input.readLine()) != null) {	// 전에는 int형일 때 -1이였지만 String타입일 경우 null값일 때까지로 받는다.
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
