/*W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch
block. try {
try
{//code}
catch (Exception e)
{//code}
catch (Exception e)
{//code}
*/
package com.corejavaAssigment2;

public class MultipelE3 {
    public static void main(String[] args) 
    {
        try 
        {
            int[] a = new int[5];
            try 
            {
                a[5] = 30 / 0;  
            } 
            catch (ArithmeticException e) 
            {
              
                System.out.println("Inner catch: ArithmeticException caught: " + e.getMessage());
            }
            a[5] = 50;

        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
           
            System.out.println("Outer catch: ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
