package com;

public class Test {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		System.out.println("--------------------");
		
		sb.append("Helloooooooooooooooooooooooooooooooooo");
		sb.append("Hellooooooooooo0o");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
