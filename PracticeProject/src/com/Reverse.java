package com;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		Reverse obj = new Reverse();
		int res = obj.reverseNumber(num);
		System.out.println(res);
		
		sc.close();
	}
	
	int reverseNumber(int num) {
		int rev = 0;
		if(num == 0) {
			return 0;
		}
		
		while(num != 0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		return rev;
	}
}
