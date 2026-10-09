package com;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {8, 3, 12, 6, 9};
		boolean found = false;
		
		System.out.print("Find the search num in the above array : ");
		int num = sc.nextInt();
		System.out.println(num);
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] == num){
				System.out.println("Num found at index : " + i);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Value not found...");
		}
		sc.close();
	}
}
