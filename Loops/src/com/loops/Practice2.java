package com.loops;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		for(int j=n; j>=1; j--) {
			for(int i=1; i<=j; i++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
