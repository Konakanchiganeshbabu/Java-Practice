package com;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		SumOfDigits obj = new SumOfDigits();
		int res = obj.getSumOfDigits(num);
		System.out.println(res);
		
		sc.close();
	}
	
	int getSumOfDigits(int num) {
		int res = 0;
		while(num != 0) {
			res += num%10;
			num = num/10;
		}
		
		return res;
	}
}
