package com;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) {
		File file = new File("D:\\Files/Hi.txt");
		
		try {
			file.createNewFile();
			System.out.println("File Created Successfully...");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
