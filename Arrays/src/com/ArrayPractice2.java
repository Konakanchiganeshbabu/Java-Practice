package com;

import java.util.Scanner;
import java.util.Arrays;
public class ArrayPractice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0; i<size; i++) {
			System.out.print("Enter the vale at index " + i + " = ");
			int num = sc.nextInt();
			arr[i] = num;
			if(arr[i] % 2 == 0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(evenCount);
		System.out.println(oddCount);
		
		sc.close();
	}

}
