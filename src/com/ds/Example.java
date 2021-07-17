package com.ds;

import java.util.HashMap;
import java.util.Hashtable;

public class Example {
	
	public static void main(String args[]) {
		
		Example ex = new Example();
		
		HashMap hm = new HashMap();
		Hashtable hma = new Hashtable();

		
		hm.put("John", "Harry");
		hm.put("John", "Marwaha");
		hm.put("Johny", "Marwaha");
		
		hm.put(null,"abc");
		hm.put(null,"abd");
		hma.put("Johny", "Marwaha");
		hma.put(null,"XYS");
		hma.put(null,"XYz");
		
	   System.out.print(hma.get(null));
		

		
		
		
	}

}
