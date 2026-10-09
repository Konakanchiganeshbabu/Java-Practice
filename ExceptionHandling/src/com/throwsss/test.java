package com.throwsss;

import java.io.FileNotFoundException;

public class test {
	public static void main(String[] args) {
		FileReaderDemo obj = new FileReaderDemo();
		
		try {
			obj.readFile();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
