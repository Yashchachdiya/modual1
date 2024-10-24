//• Write a Java programto sort a given array list.'

package com.corejavaAssigment2;

import java.util.ArrayList;
import java.util.Collections;

public class SortingC8 
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        
        System.out.println("Before Sorting ArrayList :");
        System.out.println(colors);
        
        Collections.sort(colors); 
        
        System.out.println("After Sorting ArrayList :");
        System.out.println(colors);
    }
}
