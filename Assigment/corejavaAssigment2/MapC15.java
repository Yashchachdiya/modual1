//Write a Java program to count the number of key-value (size) mappings in a map.

package com.corejavaAssigment2;

import java.util.HashMap;

public class MapC15 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> h1= new HashMap<Integer, String>();
		System.out.println("Default size is.."+h1.size());
		System.out.println("Default value is.."+h1);
		h1.put(1, "Yash");
		h1.put(2, "Deep");
		h1.put(5, "Rocky");
		
		int size = h1.size();
		
        System.out.println("Number of key-value mappings in the map : " + size);
	}
}