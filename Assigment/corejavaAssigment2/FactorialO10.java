/* Write a program to print the factorial of a number by defining a method named
'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
*(n-1) *n*/
package com.corejavaAssigment2;

import java.util.Scanner;

public class FactorialO10 
{

    public static int Factorial(int n) 
    {
        int fact = 1;
        
        for (int i = 1; i <= n; i++) 
        {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        int result = Factorial(number);

        System.out.println(number + "! = " + result);
    }
}
