//Write a Java programto search an element in an array list.
package com.corejavaAssigment2;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchC7 
{
    public static void main(String[] args) 
    {
        
        ArrayList<String> c = new ArrayList<>();
        c.add("Red");
        c.add("Green");
        c.add("Blue");
        c.add("Yellow");
        c.add("Purple");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color for search : ");
        String color = sc.nextLine();
        if (c.contains(color)) 
        {
            System.out.println(color + " is found in the ArrayList.");
        } 
        else 
        {
            System.out.println(color + " is not found in the ArrayList.");
        }
    }
}
