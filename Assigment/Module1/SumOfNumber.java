/*
 Write a program in Java to input 5 numbers from keyboard and find their sum and
average using for loop.

*/
package corejavaAssigment1;
import java.util.Scanner;
public class SumOfNumber 
{

	public static void main(String[] args) 
	{
		
		int sum=0;
		double average;
		for(int i=1;i<=5;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number :");
			int no=sc.nextInt();
			sum+=no;			
		}
		
		System.out.println(sum);
		average=sum/5;
		System.out.println(average);
	}

}
