//Write a Java program to join two array lists.

package com.corejavaAssigment2;

import java.util.ArrayList;

public class JoinC20 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Blue");
        c1.add("Green");
        
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Yellow");
        c2.add("Purple");
        c2.add("Black");

        System.out.println("Before Join List1 : " + c1);
        System.out.println("Before Join List2 : " + c2);

        c1.addAll(c2);
        
        System.out.println("After Join : " + c1);
    }
}