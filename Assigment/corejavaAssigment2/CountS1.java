/*
Write a Java program to count the letters, spaces, numbers and other characters of
an input string.


*/
package com.corejavaAssigment2;

import java.util.Scanner;

public class CountS1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String line=sc.nextLine();
		int letter=0,space=0,number=0,other=0;
	    
		for (char c : line.toCharArray()) 
		{
		      if (Character.isLetter(c)) 
		      {
		        letter++;
		      } 
		      else if (Character.isSpaceChar(c)) 
		      {
		        space++;
		      } 
		      else if (Character.isDigit(c)) 
		      {
		        number++;
		      } 
		      else 
		      {
		    	  other++;
		      }
		}    
	 
	    System.out.println("Count of Letter : "+letter);
	    System.out.println("Count of Space : "+space);
	    System.out.println("Count of Number : "+number);
	    System.out.println("Count of other : "+other);
	}

}
