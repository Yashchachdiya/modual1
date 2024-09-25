/*
Write a Java program that reads a positive integer and count the number of digits
number.
*/
package corejavaAssigment1;

import java.util.Scanner;

public class Digit 
{
	public static void main(String[] args) 
	{
		

			int count = 0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter no :");
			int no=sc.nextInt();
		if(no>=0)	
		{
			if(no==0)
			{
					System.out.println("your no is zero..."+no);
			}
				else
			{
					System.out.println("your no is positive..."+no);
			}
		 }
		else
		{
			System.out.println("your no is nagetive..."+no);
		}
		while (no > 0) 
        {
            no /= 10;  
            count++;      
        }
		System.out.println("your no count is..."+count);
		
	}

}
