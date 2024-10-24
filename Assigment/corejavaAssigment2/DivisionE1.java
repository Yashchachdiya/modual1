/*W.A.J. P to demonstrate try catch block,
• Take two numbers from the user and perform the division operation and handle
Arithmetic Exception. O/P- Enter two numbers: 10 0
Exception in thread main java.lang.ArithmeticException:/ by zero*/

package com.corejavaAssigment2;

import java.util.Scanner;

public class DivisionE1 
{
    public static void main(String[] args) 
    {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try 
        {
            int result = num1 / num2;
            System.out.println("Result : " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Exception in thread \"main\" " + e);
            System.out.println("ArithmeticException: / by zero");
        }
       
    }
}
