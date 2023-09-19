package com.java.IOStream;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
//		File f = new File("C:\\eclipse\\workspace\\20230817\\src\\HelloWorld.java");
//		String fileName = f.getName();
//		System.out.println(fileName);	// ���� Ŭ������ ���� ������ ��θ� �������� �̸� ���� getName���� ������ �� �ִ�.
//		int pos = fileName.lastIndexOf(".");	// 10
//		
//		System.out.println(fileName.substring(0, pos));	// 0~10������ ���ڿ� = ���� �̸�
//		System.out.println(fileName.substring(pos + 1));	// 11~ ���ڿ� = Ȯ����
		
//		File f = new File("C:\\eclipse\\workspace\\20230817\\src\\HelloWorld.java"); // �����ο� ���԰�ΰ� �Ȱ��� ���� �� ����
		File f = new File("./../HelloWorld.java"); // �̷��� ��θ� �����ϸ� �����ο� ���԰�ΰ� �ٸ��� ��Ÿ��
		
		System.out.println("��θ� ������ �����̸� : " + f.getPath());	
		System.out.println("������ ������ : " + f.getAbsolutePath());	
		System.out.println("������ ���԰�� : " + f.getCanonicalPath());
		System.out.println("������ ���� ���丮 : " + f.getParent());		
		
		// f.getPath() = File��ü�� �ۼ��� ��� �״�� ǥ��
		// f.getAbsolutePath() = ./ , ../�� ���ؼ� ���� ����� �ڿ� ���� ���� ��ΰ� ���� ���·� ǥ��
		// f.getCanonicalPath() = ./ , ../�� ���ؼ� ������ �� ���� ��� ��ȣ�� ������ ��ΰ� ��ȯ
		// f.getParent() = File��ü�� �ۼ��� ��� �״�� ǥ���ϵ�, ������ ���� ���丮������ ǥ��
	}

}
