/*W.A.J.P to compare a given string to the specified character sequence. Comparing
topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
*/

package com.corejavaAssigment2;

public class CompareS7 
{
    public static void main(String[] args) 
    {
      
        String s1 = "topsint.com";
        String s2 = "topsint.com";
        String s3 = "Topsint.com";

        boolean c = s1.equals(s2);
        System.out.println("Comparing \"" + s1 + "\" and \"" + s2 + "\": " + c);

        boolean d = s2.equals(s3);
        System.out.println("Comparing \"" + s2 + "\" and \"" + s3 + "\": " + d);
    }
}
