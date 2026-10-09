package com;

public class StringReverse {
	public static void main(String[] args) {
		String s = "FLMEDUTECH";
		String res = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			res += s.charAt(i);
		}
		
		System.out.println(res);
	}
}
