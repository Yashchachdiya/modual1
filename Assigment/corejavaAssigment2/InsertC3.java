//Write a Java program to insert an element into the array list at the first position.

package com.corejavaAssigment2;

import java.util.ArrayList;

public class InsertC3 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add(0, "Yellow");
        System.out.println(" after add at the first position :");
        for (String color : colors) 
        {
            System.out.println(color);
        }
    }
}
