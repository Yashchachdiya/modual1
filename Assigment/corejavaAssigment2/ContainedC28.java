//Write a Java program to get a collection view of the values contained in this map
package com.corejavaAssigment2;

import java.util.Collection;
import java.util.HashMap;


public class ContainedC28 
{
    public static void main(String[] args) 
    {
        
    	 HashMap<String, Integer> c = new HashMap<String, Integer>();
        c.put("Red",1);
        c.put("Blue",2);
        c.put("Green",3);
        c.put("White",4);
        c.put("Yellow",5);
        c.put("Purple",6);
        c.put("Black",7);
        
        System.out.println("HashMapb : " + c);

        Collection<Integer> values = c.values();

        System.out.println("Collection view of values : " + values);

       
    }
}