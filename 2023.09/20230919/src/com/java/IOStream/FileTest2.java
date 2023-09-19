package com.java.IOStream;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		// 폴더, 파일
		// 디렉토리
		
		File f = new File("C:\\practice");
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리 입니다.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[dir]" + fileName : "[file]" + fileName);	// 폴더인지 파일인지 구분
		}

	}

}
