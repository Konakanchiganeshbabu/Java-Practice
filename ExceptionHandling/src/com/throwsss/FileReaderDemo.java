package com.throwsss;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileReaderDemo {
	
	void readFile() throws FileNotFoundException{
		FileReader file = new FileReader("D://FileHandling/Java.txt");
		System.out.println("File opened Successfully");
		
		try {
			file.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}	
