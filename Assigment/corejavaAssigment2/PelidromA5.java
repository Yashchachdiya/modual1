package com.corejavaAssigment2;

public class PelidromA5 
{
    public static void main(String[] args) 
    {
        String str = "madam";
        String rev= "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
        	rev += str.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
        if (str.equals(rev)) 
        {
            System.out.println(str + " is a palindrome.");
        } else 
        {
            System.out.println(str + " is not a palindrome.");
        }
    }
}