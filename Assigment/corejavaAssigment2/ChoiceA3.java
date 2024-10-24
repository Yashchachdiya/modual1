/*Write A Java Program to take two Array input from user and sort them in
ascending or descending order as per user’s choice
*/
package com.corejavaAssigment2;

import java.util.Arrays;
import java.util.Scanner;

public class ChoiceA3 
{
	public static void sortArrayAscending(Integer[] array) 
	{
        Arrays.sort(array);
    }
    public static void sortArrayDescending(Integer[] array) 
    {
    	for (int i = 0; i < array.length - 1; i++) 
    	{
            for (int j = i + 1; j < array.length; j++) 
            {
                if (array[i] < array[j]) 
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
    	}
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        Integer[] array1 = {101, 153, 234, 745, 362, 458};
        Integer[] array2 = {1061, 1353, 2534, 7645, 3682, 4589};

        System.out.println("Choose sorting order:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        int choice = scanner.nextInt();

        if (choice == 1) 
        {
            sortArrayAscending(array1);
            sortArrayAscending(array2);
            System.out.println("Sorted arrays in ascending order:");
        } 
        else if (choice == 2) 
        {
            sortArrayDescending(array1);
            sortArrayDescending(array2);
            System.out.println("Sorted arrays in descending order:");
        } else 
        {
            System.out.println("Invalid choice!");
            return;
        }
        System.out.println("First array: " + Arrays.toString(array1));
        System.out.println("Second array: " + Arrays.toString(array2));

       
    }
}