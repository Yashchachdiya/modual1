//Write a Java programto get the number of elements in a hash set.
package com.corejavaAssigment2;

import java.util.HashSet;

public class SizeC13 
{
    public static void main(String[] args) 
    {
        HashSet<String> c = new HashSet<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Purple");
        int size = c.size();
        System.out.println("Number of elements in the Hashset : " + size);
    }
}
