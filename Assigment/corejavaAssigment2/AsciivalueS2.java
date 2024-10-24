//Write a Java program to print the ASCII value of a given character

package com.corejavaAssigment2;

import java.util.Scanner;

public class AsciivalueS2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character : ");
		char character =sc.next().charAt(0);
		
		int a=(int)character;
		
		System.out.println("Asciivalue value of  "+ character + " is.."+a);
		
	}

}
