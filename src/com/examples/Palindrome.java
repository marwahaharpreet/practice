package com.examples;

public class Palindrome {
	public static void main(String args[]) {
		
		Palindrome ps = new Palindrome();
		String origString = "Hi How are you";
		
		System.out.println("Palindrome : " + ps.isPalindrome(origString));
		System.out.println("Palindrome : " + ps.isPalindromeString(origString));
		
		
	}
	
	public boolean isPalindrome(String origString) {
		if(origString ==null) {
			return false;
		}
		StringBuilder sb = new StringBuilder(origString);
		
	
		return sb.reverse().toString().equals(origString);
	}
	
	public boolean isPalindromeString(String origString) {
		if(origString ==null) {
			return false;
		}
		int length = origString.length();
		
		for(int i=0 ; i<length/2 ; i++) {
			if(origString.charAt(i) != origString.charAt(length -i -1)) {
				return false;
			}
		}
		
		return true;
		
	}

}
