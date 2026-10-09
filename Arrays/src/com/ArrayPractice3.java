package com;

public class ArrayPractice3 {
	public static void main(String[] args) {
		int[] arr = {1, 123, 200,0, 1020, 14056};
		
		for(int i=0; i<arr.length; i++) {
			int num = arr[i];
			int numsCount = 0;
			while(num != 0) {
				num = num/10;
				numsCount += 1;
			}
			System.out.println(i + " -> " + numsCount);
		}
	}
}
