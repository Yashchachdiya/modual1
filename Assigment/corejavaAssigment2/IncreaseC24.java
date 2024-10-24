//Write a Java program to increase the size of an array list.

package com.corejavaAssigment2;

import java.util.ArrayList;

public class IncreaseC24 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> c = new ArrayList<String>();
        
        System.out.println("Default size of the ArrayList : " + c.size());
        
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        
        System.out.println("Size after add elements : " + c.size());
        
        c.add("Yellow");
        c.add("Purple");
        c.add("Black");

        System.out.println("Now size of the ArrayList : " + c.size());
 
        System.out.println("ArrayList : " + c);
       
    }
}