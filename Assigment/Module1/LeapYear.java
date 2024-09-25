/*
Write a Java program that takes a year from user and print whether that year is a leap
year or not. B19. Write a program in Java to display the first 10 natural numbers
using while loop.
*/
package corejavaAssigment1;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year :");
		int year=sc.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
				System.out.println("Your year is leapyear..."+year);
		}
			else
		{
				System.out.println("Your year is not an leapyear..."+year);
		}
		int i=1;
		while(i<=10)
		{
			System.out.print(" "+i);
			i++;
		}

		
	}

}
