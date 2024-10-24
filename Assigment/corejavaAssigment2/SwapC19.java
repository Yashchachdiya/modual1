
//Write a Java program of swap two elements in an array list.

package com.corejavaAssigment2;

import java.util.ArrayList;

public class SwapC19 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> c = new ArrayList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Purple");

        System.out.println("Before Swap : " + c);

        int a1 = 1; 
        int a2 = 3; 

        String temp = c.get(a1);
        c.set(a1, c.get(a2));
        c.set(a2, temp);
        
        System.out.println("After Swap : " + c);
    }
}
