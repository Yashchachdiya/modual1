//Write a Java programto append the specified element to the end of a hash set.

package com.corejavaAssigment2;

import java.util.HashSet;

public class HasesetC11 
{
    public static void main(String[] args) 
    {
       
        HashSet<String> c = new HashSet<String>();
        c.add("Red");
        c.add("Green");
        c.add("Blue");
        c.add("Yellow");

        System.out.println("Original HashSet:");
        System.out.println(c);

        String newColor = "Purple";
        c.add(newColor); 

        // Step 4: Print the updated HashSet
        System.out.println(" after append ");
        System.out.println(c);
    }
}
