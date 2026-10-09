package com;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to reverse : ");
		int num = sc.nextInt();
		ReverseNumber obj = new ReverseNumber();
		String res = obj.reverseNumber(num);
		System.out.println(res);
		
		sc.close();
	}
	
	String reverseNumber(int num) {
		String rev = "";
		while(num != 0) {
			rev = rev + num%10;
			num = num/10;
		}
		return rev;
	}
}
