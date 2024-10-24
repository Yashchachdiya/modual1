//Write a Java program to remove the third element froman array list.
package com.corejavaAssigment2;

import java.util.ArrayList;

public class RemoveC6 
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        colors.remove(2); 
        System.out.println("after remove third element :");
        for (String color : colors) 
        {
            System.out.println(color);
        }
    }
}
