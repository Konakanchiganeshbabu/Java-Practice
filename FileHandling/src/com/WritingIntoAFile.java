package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingIntoAFile {
	public static void main(String[] args) {
		File file = new File("D:\\Files/Newww.txt");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			String data = "Hiii This is Ganesh...";
			byte[] bytes = data.getBytes();
			fos.write(bytes);
			System.out.println("Sucessfully written into a file");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
