package com;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int size = arr.length;
		int[] revArray = new int[size];
		
		for(int i=size-1; i>=0; i--) {
			revArray[size-i-1] = arr[i];
		}
		System.out.println(Arrays.toString(revArray));
	}
}
