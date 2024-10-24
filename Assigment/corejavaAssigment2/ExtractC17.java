//Write a Java program to extract a portion of an array list.

package com.corejavaAssigment2;

import java.util.ArrayList;
import java.util.List;

public class ExtractC17 
{
    public static void main(String[] args) 
    {
        ArrayList c = new ArrayList();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Purple");
        c.add("Orange");

        System.out.println("before extract a portion of array list: " + c);

        List<String> e = c.subList(1, 4);
        System.out.println("after extract a portion of array list : " + e);
    }
}
