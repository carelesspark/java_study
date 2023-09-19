package com.java.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("src/com/java/IOStream/FileReaderTest.java");
			FileWriter fw = new FileWriter("src/com/java/IOStream/convert.txt");

			int data = 0;

			while ((data = fr.read()) != -1) {
				if (data != '\t' && data != '\n' && data != '\r') { // 3���� Ư�����ڰ� �ƴҶ���
					fw.write(data);
				}
			}
			System.out.println("�ѱ� �ȱ���");		// FileViewer������ �����µ� �� Ŭ������ �ȱ��� 
			
			fr.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
