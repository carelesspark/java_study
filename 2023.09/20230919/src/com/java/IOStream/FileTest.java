package com.java.IOStream;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
//		File f = new File("C:\\eclipse\\workspace\\20230817\\src\\HelloWorld.java");
//		String fileName = f.getName();
//		System.out.println(fileName);	// 파일 클래스를 통해 파일의 경로를 가져오면 이름 역시 getName으로 가져올 수 있다.
//		int pos = fileName.lastIndexOf(".");	// 10
//		
//		System.out.println(fileName.substring(0, pos));	// 0~10까지의 문자열 = 파일 이름
//		System.out.println(fileName.substring(pos + 1));	// 11~ 문자열 = 확장자
		
//		File f = new File("C:\\eclipse\\workspace\\20230817\\src\\HelloWorld.java"); // 절대경로와 정규경로가 똑같아 보일 수 있음
		File f = new File("./../HelloWorld.java"); // 이렇게 경로를 지정하면 절대경로와 정규경로가 다르게 나타남
		
		System.out.println("경로를 포함한 파일이름 : " + f.getPath());	
		System.out.println("파일의 절대경로 : " + f.getAbsolutePath());	
		System.out.println("파일의 정규경로 : " + f.getCanonicalPath());
		System.out.println("파일이 속한 디렉토리 : " + f.getParent());		
		
		// f.getPath() = File객체에 작성한 경로 그대로 표현
		// f.getAbsolutePath() = ./ , ../에 의해서 현재 경로의 뒤에 내가 넣은 경로가 붙은 형태로 표현
		// f.getCanonicalPath() = ./ , ../에 의해서 실제로 그 상위 경로 기호가 없어진 경로가 반환
		// f.getParent() = File객체에 작성한 경로 그대로 표현하되, 파일이 속한 디렉토리까지만 표현
	}

}
