//Write a java program Find out length of string without using inbuilt function

package com.corejavaAssigment2;

public class LengthA4 
{
    public static void main(String[] args) 
    {
        String str = "Yash Chachdiya";
        int length = findStringLength(str);
        System.out.println("String Length is : " + length);
    }

    public static int findStringLength(String str) 
    {
        int length = 0;
        for (int i = 0; i < str.length(); ) 
        {
            length++;
            i++;
        }
        return length;
    }
}