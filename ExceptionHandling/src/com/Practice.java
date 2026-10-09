package com;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter number1...");
			int num1 = sc.nextInt();
			System.out.println("Enter number2...");
			int num2 = sc.nextInt();
			System.out.println(num1/num2);
			System.out.println("Byee..");
		}catch(Exception e) {
			System.out.println("Cannot divide a number by zero");
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}
}
