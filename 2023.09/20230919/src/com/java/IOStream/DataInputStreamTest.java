package com.java.IOStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("src/com/java/IOStream/sample.dat");
			dis = new DataInputStream(fis);
			
			int i = dis.readInt();
			float f = dis.readFloat();
			boolean b = dis.readBoolean();
			
			System.out.println(i);
			System.out.println(f);
			System.out.println(b);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
