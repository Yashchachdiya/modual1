/*Write a Java program to associate the specified value with the specified key in a
Hash Map.
*/
package com.corejavaAssigment2;

import java.util.HashMap;

import java.util.Set;

public class SpicifideC14 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> h1= new HashMap<Integer, String>();
		System.out.println("Default size is.."+h1.size());
		System.out.println("Default value is.."+h1);
		h1.put(1, "Yash");
		h1.put(2, "Deep");
		h1.put(5, "Rocky");
		System.out.println("Now size is.."+h1.size());
		System.out.println("Now value is.."+h1);
		Set s1=h1.entrySet();
	
		
	}

}
