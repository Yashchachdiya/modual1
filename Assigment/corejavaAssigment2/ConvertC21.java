//Write a Java program to convert a hash set to an array.

package com.corejavaAssigment2;

import java.util.HashSet;

public class ConvertC21
{
    public static void main(String[] args) 
    {
       
        HashSet<String> c = new HashSet<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Purple");

        System.out.println("HashSet List : " + c);

        String[] array = c.toArray(new String[0]);

        System.out.println("Array : ");
        for (String color : array) 
        {
            System.out.println(color);
        }
    }
}
