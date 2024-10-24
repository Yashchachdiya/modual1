/*Write a Java programto print all the elements of an Array List using the position of
the elements.*/
package com.corejavaAssigment2;

import java.util.ArrayList;

public class ElementC26 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> c = new ArrayList<String>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Purple");

        System.out.println("Elements of the ArrayList :");
        
        for (int i = 0; i < c.size(); i++) 
        {
            System.out.println("Element at position " + i + " : " + c.get(i));
        }
    }
}