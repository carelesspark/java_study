package com.java.IOStream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileViewer {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/com/java/IOStream/FileViewer.java"); // 예외 처리 필요, throw 또는
																							// try/catch문을 통해 예외처리 가능
		InputStreamReader reader = new InputStreamReader(fis, "utf-8"); // 바이트 기반 스트림을 문자 기반 스트림으로 연결시켜준다.
																		// 바이트 기반 스트림의 데이터를 지정된 인코딩 문자 데이터로 변환하는 작업도
																		// 수행한다. 
		BufferedReader br = new BufferedReader(reader);	// 보조스트림 사용
//		FileOutputStream fos = new FileOutputStream("src/com/java/IOStream/FileCopy.txt");	
		
//		int data = 0;	// read메소드 사용 - 1번에 1byte씩 읽어온다
//		
//		while((data = fis.read()) != -1) {
//			char c = (char)data;
//			System.out.print(c);
//		}	// FileInputStream 사용

//		int data = 0; // read메소드 사용 - 1번에 1byte씩 읽어온다
//
//		while ((data = reader.read()) != -1) {
//			char c = (char) data;
//			System.out.print(c);
//		}	// InputStreamReader 사용, 한글이 깨져서 사용했는데 이클립스 내에서 utf-8을 사용하지 않아서 똑같이 깨짐현상 발생, utf-8로 변경해야함

		
//		int data = 0;
//		while((data = fis.read()) != -1) {
//			fos.write(data);
//		}	// 같은 폴더 내에 FileCopy.txt 파일이 생기는 것을 확인가능
//		
//		fos.close();
//		fis.close();
		
		int data = 0;	// read메소드 사용 - 1번에 1byte씩 읽어온다
		
		while((data = br.read()) != -1) {
			char c = (char)data;
			System.out.print(c);
		}	// BufferedReader 사용

		
	}

}
