package com;

public class twoDArray {
	public static void main(String[] args) {
		
		int[][] arr = {
				{2, 1, 4, 9, 2}, {7, 8, 1, 2, 6}, {5, 2, 9, 12, 6}, {7, 16, 14, 21, 9}, {4, 12, 8, 11, 9}
		};
		
		int[][] arr2 = {
			    {7, 14, 3, 22, 9, 18, 5, 25, 11},
			    {16, 2, 21, 8, 13, 4, 19, 7, 24},
			    {10, 25, 6, 15, 3, 20, 12, 9, 17},
			    {23, 5, 14, 1, 18, 11, 22, 6, 13},
			    {4, 19, 8, 24, 10, 2, 16, 21, 7},
			    {15, 3, 25, 12, 5, 18, 9, 14, 20},
			    {22, 6, 11, 17, 1, 23, 8, 19, 4},
			    {13, 20, 7, 16, 24, 10, 3, 15, 21},
			    {9, 18, 2, 14, 5, 22, 12, 6, 25}
			};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		int res = findSum(arr);
		System.out.println(res);
		
		int diagonalRes = diagonalSum(arr);
		System.out.println(diagonalRes);
		
		
		int antiDiagonalRes = antiDiagonalSum(arr);
		System.out.println(antiDiagonalRes);
		
		int zSumRes = zSum(arr);
		System.out.println(zSumRes);
		
		int circualSumRes = circualSum(arr);
		System.out.println(circualSumRes);
		
		int nSumRes = nSum(arr);
		System.out.println(nSumRes);
		
		int diamondSumRes = diamondSum(arr2);
		System.out.println(diamondSumRes);
	}
	
	public static int findSum(int[][] arr) {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		
		return sum;
	}
	
	public static int diagonalSum(int[][] arr) {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i][i];
		}
		
		return sum;
	}
	
	public static int antiDiagonalSum(int[][] arr) {
		int sum = 0;
		
		int n = arr.length;
		for(int i=0; i<n; i++) {
			int m = n-i-1;
			sum += arr[i][m];
		}
		
		return sum;
	}
	
	public static int zSum(int[][] arr) {
		int sum = 0;
		
		int n = arr.length;
		for(int i=0; i<n; i++) {
			if(i==0 || i==n-1) {
				for(int j=0; j<n; j++) {
					sum += arr[i][j];
				}
			}else {
				sum += arr[i][n-i-1];
			}
		}
		
		return sum;
	}
	
	public static int nSum(int[][] arr) {
		int sum = 0;
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j==0 || j==n-1) {
					sum += arr[i][j];
				}else if(i==j) {
					sum += arr[i][j];
				}
			}
		}
		
		return sum;
	}
	
	public static int circualSum(int[][] arr) {
		int sum = 0;
		
		int n = arr.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0 || i==n-1 || j==n-1) {
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}
	
	public static int diamondSum(int[][] arr) {
		int sum = 0;
		int n = arr.length;
		int mid = n/2;
		
		for(int i=0; i<n; i++) {
			if(i==0 || i==n-1) {
				sum += arr[i][mid];
			}else if(i <= mid){
				sum += arr[i][mid-i] + arr[i][mid+i];
			}else {
				sum += arr[i][i-mid] + arr[i][(n-1) - (i-mid)];
			}
		}
		
		return sum;
	}
	
	
}













