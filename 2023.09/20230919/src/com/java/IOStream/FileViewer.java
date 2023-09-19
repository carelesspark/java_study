package com.java.IOStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileViewer {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/com/java/IOStream/FileViewer.java"); // ���� ó�� �ʿ�, throw �Ǵ�
																							// try/catch���� ���� ����ó�� ����
		InputStreamReader reader = new InputStreamReader(fis, "utf-8"); // ����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��������ش�.
																		// ����Ʈ ��� ��Ʈ���� �����͸� ������ ���ڵ� ���� �����ͷ� ��ȯ�ϴ� �۾���
																		// �����Ѵ�. 
		BufferedReader br = new BufferedReader(reader);	// ������Ʈ�� ���
//		FileOutputStream fos = new FileOutputStream("src/com/java/IOStream/FileCopy.txt");	
		
//		int data = 0;	// read�޼ҵ� ��� - 1���� 1byte�� �о�´�
//		
//		while((data = fis.read()) != -1) {
//			char c = (char)data;
//			System.out.print(c);
//		}	// FileInputStream ���

//		int data = 0; // read�޼ҵ� ��� - 1���� 1byte�� �о�´�
//
//		while ((data = reader.read()) != -1) {
//			char c = (char) data;
//			System.out.print(c);
//		}	// InputStreamReader ���, �ѱ��� ������ ����ߴµ� ��Ŭ���� ������ utf-8�� ������� �ʾƼ� �Ȱ��� �������� �߻�, utf-8�� �����ؾ���

		
//		int data = 0;
//		while((data = fis.read()) != -1) {
//			fos.write(data);
//		}	// ���� ���� ���� FileCopy.txt ������ ����� ���� Ȯ�ΰ���
//		
//		fos.close();
//		fis.close();
		
		int data = 0;	// read�޼ҵ� ��� - 1���� 1byte�� �о�´�
		
		while((data = br.read()) != -1) {
			char c = (char)data;
			System.out.print(c);
		}	// BufferedReader ���

		
	}

}
