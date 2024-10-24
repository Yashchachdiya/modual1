//Write a Java programto retrieve an element (at a spec. index) froma given array list.
package com.corejavaAssigment2;

import java.util.ArrayList;

public class IndexC4 
{
    public static void main(String[] args) 
    {
      
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        int index = 2;  
        String color = colors.get(index);
        System.out.println("Element at index " + index + " : " + color);
    }
}
