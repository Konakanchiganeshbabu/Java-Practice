package com.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingIntoAFileFOS {
	public static void main(String[] args) {
		File file = null;
		FileOutputStream fos = null;
		
		try {
			for(int i=1; i<=5; i++) {
				String filePath = "D:\\Practice\\File" + i + ".txt";
				file = new File(filePath);
				String text = "This if File" + i;
				byte[] bytes = text.getBytes();
				fos = new FileOutputStream(file);
				fos.write(bytes);
			}
			System.out.println("Successfully Written the data into files");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
