//Write a java program to find out the max number from given array using function

package com.corejavaAssigment2;


public class NumberA1 
{

    public static int findMax(int[] array) 
    {
        int max = array[0];  
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] > max) 
            {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) 
    {
      
        int[] array = {101, 153, 234, 745, 362, 458};
        int n = findMax(array);
        System.out.println("The maximum No is : " +n);
    }
}
