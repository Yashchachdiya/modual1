/*W.A.J. P to demonstrate try catch block, take two numbers from the user by
Command line argument and performthe division operation and handle Arithmetic
O/PException in thread main java. Lang. Arithmetic Exception:/ by zero
*/

package com.corejavaAssigment2;

public class DivisionE4 {
    public static void main(String[] args)
    {
    	if (args.length < 2) 
    	{
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }
        try 
        {
        
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: / by zero");
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Please enter valid integers as input.");
        }
    }
}
