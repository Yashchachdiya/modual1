/*W.A.J.P to create the validate method that takes integer value as a parameter. If the
age is less than 18, then throw an Arithmetic Exception otherwise print a message
welcome to vote.*/


package com.corejavaAssigment2;

public class VoteE5 
{
    public static void validate(int age) 
    {
        if (age < 18) 
        {
            throw new ArithmeticException("Not eligible to vote. Age must be 18 or above.");
        } 
        else 
        {
            System.out.println("Welcome to vote.");
        }
    }

    public static void main(String[] args) 
    {
        
        try 
        {
            validate(20);  
            validate(16);  
        } 
        catch (ArithmeticException e) 
        {

            System.out.println("Exception : " + e.getMessage());
        }

    }
}
