package com;

public class ArrayPractice1 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 50, 40, 30};
		ArrayPractice1 obj = new ArrayPractice1();
		int res = obj.findMax(arr);
		System.out.println(res);
		
	}
	
	int findMax(int[] array) {
		int max = array[0];
		
		for(int i=1; i<array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
