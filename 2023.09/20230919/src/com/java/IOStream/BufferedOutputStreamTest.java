package com.java.IOStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("test.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos, 5);	// ������Ʈ�� ���
			
			for(int i = 1; i <= 9; i++) {
				bos.write(i);			// �̷��� �� ��� 12345�� ������ ���ۿ� 5�� ũ�⸦ ������ ä���ߵǹǷ� 6789�� �Ѿ�� ����
			}
			
			bos.flush();	// flush�� ���� ���� ���� ������ ������ �о
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
