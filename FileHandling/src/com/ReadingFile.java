package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class ReadingFile {
	public static void main(String[] args) {
		File file = new File("D:\\\\Files/Hi.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int temp;
			while((temp = fis.read()) != -1) {
				System.out.print((char)temp);
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
