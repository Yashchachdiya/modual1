/*Write a program which will ask the user to enter his/her marks (out of 100). Define a
method that will display grades according to the marks entered as below:
Marks Grade :
1-100 A
1-90 B
1-80 B
1-70 C
1-60 D
41-50 DD40 Fail*/

package com.corejavaAssigment2;

import java.util.Scanner;

public class GradeO12 
{
    
    public static void displayGrade(int marks)
    {
 
        if (marks > 90 && marks <= 100) 
        {
            System.out.println("Grade: A");
        } 
        else if (marks > 80 && marks <= 90) 
        {
            System.out.println("Grade : B");
        } 
        else if (marks > 70 && marks <= 80) 
        {
            System.out.println("Grade : B");
        } 
        else if (marks > 60 && marks <= 70) 
        {
            System.out.println("Grade : C");
        } 
        else if (marks > 50 && marks <= 60) 
        {
            System.out.println("Grade : D");
        } 
        else if (marks > 40 && marks <= 50) 
        {
            System.out.println("Grade : DD");
        } 
        else if (marks <= 40) 
        {
            System.out.println("Grade : Fail");
        } 
        else 
        {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args)
    {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks : ");
        int marks = scanner.nextInt();
        displayGrade(marks);
 
    }
}
