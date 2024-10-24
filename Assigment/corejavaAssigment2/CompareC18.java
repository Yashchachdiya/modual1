//Write a Java programto compare two array lists.

package com.corejavaAssigment2;

import java.util.ArrayList;

public class CompareC18 

{
    public static void main(String[] args) 
    {
     
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("Apple");
        a1.add("Banana");
        a1.add("Cherry");

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("Apple");
        a2.add("Banana");
        a2.add("Cherry");
        
        if (a1.equals(a2)) 
        {
            System.out.println("ArrayLists are equal.");
        } 
        else 
        {
            System.out.println("ArrayLists are not equal.");
        }
    }
}
