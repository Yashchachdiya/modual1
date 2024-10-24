//Write a Java program to copy one array list into another.
package com.corejavaAssigment2;

import java.util.ArrayList;

public class CopyC9 
{
    public static void main(String[] args) 
    {
        ArrayList<String> originalColors = new ArrayList<String>();
        originalColors.add("Red");
        originalColors.add("Green");
        originalColors.add("Blue");
        originalColors.add("Yellow");
        originalColors.add("Purple");

        ArrayList<String> c = new ArrayList<String>();

        c.addAll(originalColors);

        System.out.println("Original ArrayList :");
        System.out.println(originalColors);
        
        System.out.println("Copied ArrayList :");
        System.out.println(c);
    }
}
