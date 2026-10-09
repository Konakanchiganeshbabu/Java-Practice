package com;

import java.util.Scanner;

public class NumberOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Digits to count : ");
		int num = sc.nextInt();
		NumberOfDigits obj = new NumberOfDigits();
		int res = obj.countDigits(num);
		System.out.println(res);
		
		sc.close();
	}
	
	int countDigits(int num) {
		int count = 0;

		if(num == 0) {
			return 1;
		}
		
		if(num < 0) {
			num = Math.abs(num);
		}
		
		while(num>0) {
			num = num/10;
			count++;
		}
		
		return count;
	}
}
