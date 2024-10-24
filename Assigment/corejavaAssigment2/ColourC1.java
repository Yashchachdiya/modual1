package com.corejavaAssigment2;

import java.util.ArrayList;

public class ColourC1 
{
    public static void main(String[] args) 
    {
        ArrayList<String> color = new ArrayList<String>();
        color.add("Red");
        color.add("Green");
        color.add("Blue");
        color.add("Yellow");
        color.add("Purple");
        System.out.println("Colors in the ArrayList :");
        for (String colors : color) 
        {
            System.out.println(colors);
        }
    }
}
