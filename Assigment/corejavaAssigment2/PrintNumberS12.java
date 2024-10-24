/*Create a class named 'Print Number' to print various numbers of different data types
by creating different methods with the same name 'printn' having a parameter for
each data type.*/
package com.corejavaAssigment2;

public class PrintNumberS12 
{

    public void printn(int number) 
    {
        System.out.println("Integer : " + number);
    }

    public void printn(double number) 
    {
        System.out.println("Double : " + number);
    }

    public void printn(float number) 
    {
        System.out.println("Float : " + number);
    }

    public void printn(long number) 
    {
        System.out.println("Long : " + number);
    }

    public static void main(String[] args) 
    {
        
    	PrintNumberS12 p = new PrintNumberS12();
        
        p.printn(10);            
        p.printn(15.5);         
        p.printn(20.45f);         
        p.printn(100000);       
      
    }
}
