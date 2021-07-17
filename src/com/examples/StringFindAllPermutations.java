package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StringFindAllPermutations {
	
	public static void main(String args[]) {
		StringFindAllPermutations sfap = new StringFindAllPermutations();

        String s2 = "ABCD";

       System.out.println("\nPermutations for " + s2 + " are: \n" + sfap.permutationFinder(s2));     
       }
	
	public List<String> permutationFinder(String str){
		

		
		//Set<String> perm = new HashSet<String>();
		List<String> perm = new ArrayList<String>();

		if(str == null) {
			return null;
		}else if(str.length() ==0) {
			perm.add("");
			return perm;
			
		}
		
		char initial = str.charAt(0);
		System.out.println("initial : " + initial);
		String rem = str.substring(1);
		System.out.println("rem : " + rem);
        List<String> words = permutationFinder(rem);
		System.out.println("words : "+ words);
		
		for(String strNew : words) {
			System.out.println("strNew " +strNew );
			System.out.println("words : "+ words);
			for(int i=0 ; i <= strNew.length(); i++) {
				System.out.println("i: " + i);
				perm.add(charInsert(strNew , initial , i));
			}
		}
		
		return perm;
	}
	
	public String charInsert(String str, char c, int j) {
		System.out.println("String : " + str + " intial : " + c + " j : " +j);
		String begin = str.substring(0,j);
		String end = str.substring(j);
		System.out.println("begin : " + begin);
		System.out.println("end : " +  end);
		System.out.println("begin+c+end : " + begin+c+end);
		
		return begin+c+end;
		
	}

}
