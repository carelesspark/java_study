package com.java.IOStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);	// 보조스트림 사용
			
			for(int i = 1; i <= 9; i++) {
				bos.write(i);			// 이렇게 될 경우 12345는 들어가지만 버퍼에 5의 크기를 무조건 채워야되므로 6789는 넘어가지 못함
			}
			
			bos.flush();	// flush를 통해 버퍼 내에 파일을 강제로 밀어냄
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
