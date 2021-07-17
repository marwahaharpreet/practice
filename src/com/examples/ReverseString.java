package com.examples;

public class ReverseString {
	
	public static void main(String args[]) {
		String origString = "Hello";
		System.out.println("Reversed String is : "+ reverseString(origString));
		
		
		StringBuilder sb = new StringBuilder(origString);
		System.out.println("Reversed String is : "+ sb.reverse().toString());
		
	}
	
	private static String reverseString(String origString) {
		
		
		StringBuilder sb = new StringBuilder();
		for(int i =origString.length()-1; i >=0;  i--) {
			sb.append(origString.charAt(i));
			
		}
		
		
		return sb.toString();
		
	}
	
	
	

}
