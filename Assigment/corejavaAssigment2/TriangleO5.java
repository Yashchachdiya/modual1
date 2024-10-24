/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
5 units by creating a class named 'Triangle' without any parameter in its constructor.*/


package com.corejavaAssigment2;

class Triangle 
{
	int s1,s2,s3;
	
	Triangle()
	{
		s1=3;
		s2=4;
		s3=5;
	}
	
	public void printPerimeter() 
	{
        int p = s1 + s2 + s3;
        System.out.println("Perimeter of Triangle : " + p);
    }

	public void printArea() 
    {
    	double s = (s1 + s2 + s3) / 2; 
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        System.out.println("Area of Triangle : " + area);
    }
}
public class TriangleO5 
{
	public static void main(String[] args) 
	{
		Triangle t =new Triangle();
		t.printPerimeter();
		t.printArea();
		
	}

}
