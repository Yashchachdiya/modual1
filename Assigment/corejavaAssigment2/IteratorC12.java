//Write a Java program to iterate through all elements in a hash list.
package com.corejavaAssigment2;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorC12 
{
    public static void main(String[] args) 
    {
        HashSet<String> c = new HashSet<String>(); 
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Purple");

        System.out.println("Use forloop :");
        for (String color : c) 
        {
            System.out.println(color);
        }

        System.out.println("Use Iterator :");
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
       
    }
}
