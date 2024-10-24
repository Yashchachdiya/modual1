/*Write a Java program to replace the second element of an Array List with the
specified element.*/
package com.corejavaAssigment2;

import java.util.ArrayList;

public class ReplaceC25 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> c = new ArrayList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Purple");

        System.out.println("Before Replace ArrayList: " + c);
        
        c.set(1, "Black");
        
        System.out.println("After Replace ArrayList: " + c);
    }
}