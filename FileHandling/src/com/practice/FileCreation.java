package com.practice;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) {
		File file = null;
		
		try {
			for(int i=1; i<=10; i++) {
				String filePath = "D:\\Practice\\File" + i + ".txt";
				file = new File(filePath);
				file.createNewFile();
			}
			
			System.out.println("Successfully created all 10 files...");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}	
