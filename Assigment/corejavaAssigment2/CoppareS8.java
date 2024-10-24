/*W.A.J.P to check whether a given string ends with the contents of another string.
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True*/

package com.corejavaAssigment2;

public class CoppareS8 
{
    public static void main(String[] args) 
    {
        String s1 = "Java Exercises";
        String s2 = "se";
        String s3 = "Java Exercise";

        boolean c1 = s1.endsWith(s2);
        System.out.println("\"" + s1 + "\" ends with \"" + s2 + "\": " + c1);

        boolean c2 = s3.endsWith(s2);
        System.out.println("\"" + s3 + "\" ends with \"" + s2 + "\": " + c2);
    }
}
