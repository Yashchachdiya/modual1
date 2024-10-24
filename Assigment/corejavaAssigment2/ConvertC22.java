// Write a Java programto convert a hash set to a List/Array List.

package com.corejavaAssigment2;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertC22 
{
    public static void main(String[] args) 
    {

        HashSet<String> c = new HashSet<>();
        c.add("Red");
        c.add("Blue");
        c.add("Green");
        c.add("Yellow");
        c.add("Purple");

        System.out.println("HashSet : " + c);

        ArrayList<String> a = new ArrayList<>(c);

        System.out.println("ArrayList : " + a);
    }
}
