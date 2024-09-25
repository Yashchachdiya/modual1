/*
Write a Java program to Take three numbers from the user and print the greatest
number.
*/
package corejavaAssigment1;

import java.util.Scanner;

public class Number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A :");
		int a=sc.nextInt();
		System.out.println("Enter B :");
		int b=sc.nextInt();
		System.out.println("Enter C :");
		int c=sc.nextInt();
		if(a>=b && a>=c)
	{
			System.out.println("A is Max.."+a);
	}
		else if(b>=a && b>=c)
	{
			System.out.println("B is Max.."+b);
	}
		else if(c>=a && c>=b)
		{
				System.out.println("C is Max.."+c);
		}
		
	}

}
