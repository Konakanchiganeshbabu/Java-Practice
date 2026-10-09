package com.loops.practice;

public class Question2 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(i>50) {
				if(i%2 == 0 && i%17 == 0) {
					break;
				}else {
					System.out.println(i);
				}
			}else {
				System.out.println(i);
			}
		}
	}
}
