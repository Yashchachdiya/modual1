/*Create a class to print the area of a square and a rectangle. The class has two methods
with the same name but different number of parameters. The method for printing
area of a rectangle has two parameters which are length and breadth respectively
while the other method for printing area of square has one parameter which is side
of square.*/


package com.corejavaAssigment2;

public class AreaO1 
{
	public void print(int length, int breadth) 
	{
        int area = length * breadth;
        System.out.println("Area of Rectangle is : " + area);
    }
    public void print(int side) 
    {
        int area = side * side;
        System.out.println("Area of Square is : " + area);
    }
	public static void main(String[] args) 
	{
		AreaO1 s = new AreaO1();
        s.print(15, 46); 
        s.print(45); 
		
	}

}
