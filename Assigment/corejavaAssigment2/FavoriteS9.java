/*W.A.J.P to check whether a given string starts with the contents of another string.
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
with Red? False I3.*/


package com.corejavaAssigment2;

public class FavoriteS9 
{
    public static void main(String[] args) 
    {
       
        String s1 = "Red is my favorite color.";
        String s2 = "Red";
        String s3 = "Orange is also my favorite color.";

        boolean c1 = s1.startsWith(s2);
        System.out.println("\"" + s1 + "\" start with \"" + s2 + "\" : " + c1);

        boolean c2 = s3.startsWith(s2);
        System.out.println("\"" + s3 + "\" start with \"" + s2 + "\" : " + c2);
    }
}
