/*Write a Java programto check whether a map contains key-value mappings(empty)
or not.*/

package com.corejavaAssigment2;

import java.util.HashMap;

public class ContainsC23 
{
    public static void main(String[] args) 
    {
       
        HashMap<String, Integer> c = new HashMap<String, Integer>();

        if (c.isEmpty()) 
        {
            System.out.println("The map is empty.");
        } 
        else 
        {
            System.out.println("The map is not empty.");
        }

        c.put("Bliue", 1);
        c.put("Red", 2);

        if (c.isEmpty()) 
        {
            System.out.println("The map is empty.");
        } 
        else 
        {
            System.out.println("The map is not empty.");
        }
    }
}
