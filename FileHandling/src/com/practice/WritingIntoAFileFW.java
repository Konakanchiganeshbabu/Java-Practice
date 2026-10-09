package com.practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoAFileFW {
	public static void main(String[] args) {
		File file = null;
		FileWriter fw = null;
		
		try {
			for(int i=6; i<=10; i++) {
				String filePath = "D:\\Practice\\File" + i + ".txt";
				file = new File(filePath);
				String data = "This is File" + i;
				fw = new FileWriter(file);
				fw.write(data);
				fw.close();
			}
			System.out.println("Successfully written the data into files");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
