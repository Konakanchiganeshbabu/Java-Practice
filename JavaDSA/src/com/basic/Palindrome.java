package com.basic;

public class Palindrome {
	public static void main(String[] args) {
		String s1 = "wow";
		String s2 = "ganesh";
		String s3 = "ababa";
		
		System.out.println(checkPalindrome(s1));
		System.out.println(checkPalindrome(s2));
		System.out.println(checkPalindrome(s3));
		
		System.out.println("=========================");
		
		System.out.println(checkPalindrome2(s1));
		System.out.println(checkPalindrome2(s2));
		System.out.println(checkPalindrome2(s3));
	}
	
	public static boolean checkPalindrome(String s) {
		String newString = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			newString += ch;
		}
		
		if(s.equals(newString)) {
			return true;
		}
		
		
		return false;
	}
	
	public static boolean checkPalindrome2(String s) {
		int end = s.length()-1;
		for(int i=0; i<=s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(end)) {
				return false;
			}else {
				end--;
			}
		}
		
		return true;
	}
	
}
