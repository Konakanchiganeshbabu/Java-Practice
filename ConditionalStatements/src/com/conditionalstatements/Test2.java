package com.conditionalstatements;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not eligible to vote");
		}
		sc.close();
	}
}
