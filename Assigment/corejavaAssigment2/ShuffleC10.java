// Write a Java programto shuffle elements in an array list.
package com.corejavaAssigment2;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleC10 
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println("Original ArrayList:");
        System.out.println(colors);

        Collections.shuffle(colors);

        System.out.println("After Shuffle ArrayList:");
        System.out.println(colors);
    }
}
