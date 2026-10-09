package com;

import java.util.Scanner;

public class StringConcatenation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringConcatenation obj = new StringConcatenation();
		System.out.print("Enter the str1 : ");
		String s1 = sc.nextLine();
		System.out.print("Enter the str2 : ");
		String s2 = sc.nextLine();
		
		String res = obj.concatenation(s1, s2);
		System.out.println(res);
		 
		
		sc.close();
	}
	
	String concatenation(String str1, String str2) {
		String res = str1 + " " + str2;
		return res;
	}
}
