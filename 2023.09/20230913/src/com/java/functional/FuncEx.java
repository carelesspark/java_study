package com.java.functional;

import java.util.ArrayList;

public class FuncEx {
	static <T> void printArr(ArrayList<T> list) {
		for(T num : list) {
			System.out.println(num);
		}
	}
}
