package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingAFile {
	public static void main(String[] args) {
		File file1 = new File("D:\\Files/Hi.txt");
		File file2 = new File("D:\\Files/copy.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);
			int temp;
			while((temp = fis.read()) != -1) {
				fos.write(temp);
			}
			System.out.println("Copied Successfully...");
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
