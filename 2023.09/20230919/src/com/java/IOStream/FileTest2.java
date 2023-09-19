package com.java.IOStream;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		// ����, ����
		// ���丮
		
		File f = new File("C:\\practice");
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮 �Դϴ�.");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "[dir]" + fileName : "[file]" + fileName);	// �������� �������� ����
		}

	}

}
