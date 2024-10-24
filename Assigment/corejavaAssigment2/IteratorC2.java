// Write a Java programto iterate through all elements in an array list.
package com.corejavaAssigment2;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorC2 
{
    public static void main(String[] args) 
    {
        ArrayList<String> color = new ArrayList<>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Yellow");
        color.add("Purple");

        Iterator<String> i1 = color.iterator();
        while (i1.hasNext()) 
        {
            System.out.println(i1.next());
        }
    }
}
