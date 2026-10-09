package com;

import java.io.File;
import java.io.IOException;

public class NewFileCreation {
	public static void main(String[] args) {
		File file = new File("D:\\Files/New.txt");
		
		try {
			file.createNewFile();
			System.out.println("New file created successfully...");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
