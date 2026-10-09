package com;

public class SpiralTraversal {
	public static void main(String[] args) {
		
		int[][] arr = {
			    {1,  2,  3,  4},
			    {5,  6,  7,  8},
			    {9, 10, 11, 12},
			    {13, 14, 15, 16}
		};
		
		int n = arr.length;
		int m = arr[0].length;
		
		int left = 0;
		int right = m-1;
		
		int top = 0;
		int bottom = n-1;
		
		int count = 0;
		int total = n*m;
		
		while(count < total) {
			
			for(int i=left; i<=right && count < total; i++) {
				System.out.print(arr[top][i] + " ");
				count++;
			}
			top++;
//			System.out.println();
			
			for(int i=top; i<=bottom && count < total; i++) {
				System.out.print(arr[i][right] + " ");
				count++;
			}
			right--;
//			System.out.println();
			
			for(int i=right; i>=left && count < total; i--) {
				System.out.print(arr[bottom][i] + " ");
				count++;
			}
			bottom--;
//			System.out.println();
			
			for(int i=bottom; i>=top && count < total; i--) {
				System.out.print(arr[i][left] + " ");
				count++;
			}
			left++;
//			System.out.println();
		}
	
		
		
	}
}
