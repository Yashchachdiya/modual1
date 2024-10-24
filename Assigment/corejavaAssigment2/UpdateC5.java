//Write a Java programto update specific array element by given element.
package com.corejavaAssigment2;

import java.util.ArrayList;

public class UpdateC5 
{
    public static void main(String[] args) 
    {
       
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        int indexToUpdate = 2;  
        String newColor = "Orange";  
        colors.set(indexToUpdate, newColor);  
        System.out.println(" after update " + indexToUpdate + " :"+"Posation");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
