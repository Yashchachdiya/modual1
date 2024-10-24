///Write a Java program to reverse elements in an array list.

package com.corejavaAssigment2;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseC16 
{
    public static void main(String[] args) 
    {
        
        ArrayList c = new ArrayList();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Purple");

        System.out.println("Before Reversed : " + c);

        Collections.reverse(c);
        System.out.println("After Reversed : " + c);
    }
}
