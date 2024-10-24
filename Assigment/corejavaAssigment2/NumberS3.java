/*
Write a Java program that accepts an integer (n) and computes the value of
n+nn+nnn. Input number: 5
5 + 55 + 555


*/
package com.corejavaAssigment2;

import java.util.Scanner;

public class NumberS3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Singel Digit Number : ");
		int n =sc.nextInt();
	    int nn,nnn;
		nn=n*10+n;
		nnn=n*100+nn;
		System.out.println("given number series is " +n+"+"+nn+"+"+nnn+"="+(n+nn+nnn));
		
	}

}
