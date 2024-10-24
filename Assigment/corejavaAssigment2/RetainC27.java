/*Write a Java program to compare two sets and retain elements which are same on
both sets.*/
package com.corejavaAssigment2;

import java.util.HashSet;

public class RetainC27 
{
    public static void main(String[] args) 
    {
        
    	HashSet<String> c1 = new HashSet<>();
        
        c1.add("Red");
        c1.add("Blue");
        c1.add("Green");
        c1.add("White");
        
    	HashSet<String> c2 = new HashSet<>();
        
        c2.add("Yellow");
        c2.add("Blue");
        c2.add("Purple");
        c2.add("Black");

        System.out.println("Set 1 : " + c1);
        System.out.println("Set 2 : " + c2);

        c1.retainAll(c2);

        System.out.println("Common elements after retain: " + c1);
       
    }
}