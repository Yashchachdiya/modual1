// Write a Java program to display the system time.

package com.corejavaAssigment2;

import java.time.LocalTime;

public class TimeS4 
{
	public static void main(String[] args) 
	{
		LocalTime currentTime = LocalTime.now();

        System.out.println("Current system time: " + currentTime);
		
	}

}
