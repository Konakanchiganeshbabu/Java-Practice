package com;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the num to check : ");
		int num = sc.nextInt();
		
		int total = 0;
		String s = String.valueOf(num);
		int len = s.length();
		
		for(int i=0; i<len; i++) {
			char ch = s.charAt(i);
			int n = ch - '0';
			total += Math.pow(n, len);
		}
		
		if(num == total) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}
		
		sc.close();
	}
}
