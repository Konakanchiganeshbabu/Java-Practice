package com;

import java.util.Scanner;

public class SumOfNumsInInterval {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter range 1 : ");
		int input1 = sc.nextInt();
		
		System.out.print("Enter range 2 : ");
		int input2 = sc.nextInt();
		
		int sum = 0;
		
		for(int i=input1; i<=input2; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		sc.close();
	}
}
