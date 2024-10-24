/*Write a java program to find out the 2nd max number from given array using
function.*/

package com.corejavaAssigment2;

public class NumberA2 
{

    public static int findMax(int[] array) 
    {
    	int max = array[0];
        int smax = Integer.MIN_VALUE;
        
        for (int i = 1; i < array.length; i++) 
        {
            if (array[i] > max) 
            {
            	smax = max;
                max = array[i];
            } 
            else if (array[i] > smax && array[i] != max) 
            {
            	smax = array[i];
            }
        }
        return smax;
    }

    public static void main(String[] args) 
    {
      
        int[] array = {101, 153, 234, 745, 362, 458};
        int n = findMax(array);
        System.out.println("second maximum No is : " +n);
    }
}
