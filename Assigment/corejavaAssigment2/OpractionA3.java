/*Write a java program to make addition, Subtraction and multiplication of two
matrix using 2-D Array*/

package com.corejavaAssigment2;

import java.util.Scanner;

public class OpractionA3 
{
	public static void main(String[] args) 
	{
		int[][] a=new int [3][3];
		int[][] b=new int [3][3];
		int[][] c=new int [3][3];
		int[][] d=new int [3][3];
		int[][] e=new int [3][3];

		System.out.println("Now Start A Array..");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			
				System.out.println("a ["+i+"]["+j+"]=");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Now Start B Array..");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			
				System.out.println("b ["+i+"]["+j+"]=");
				b[i][j]=sc.nextInt();
			}
			System.out.println();
		}
			System.out.println("Matrix Addition..");
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
					System.out.print(c[i][j]+" ");
					
				}
				System.out.println();
			}
            System.out.println("Matrix Subtraction..");
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					d[i][j]=a[i][j]-b[i][j];
					System.out.print(d[i][j]+" ");
					
				}
				System.out.println();
			}
            System.out.println("Matrix Multiplication..");
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					e[i][j]=a[i][j]*b[i][j];
					System.out.print(e[i][j]+" ");
					
				}
				System.out.println();
			}
		}
		
	}



