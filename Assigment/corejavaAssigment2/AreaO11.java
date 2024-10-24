/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 'RectangleArea' taking two
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
area of rectangle, square and circle respectively. Create an object of class 'Area' and
call all the three methods*/
package com.corejavaAssigment2;

abstract class Shape 
{
	 public abstract double RectangleArea(double length, double breadth);
	 public abstract double SquareArea(double side);
	 public abstract double CircleArea(double radius);

}

class Area extends Shape 
{

@Override
public double RectangleArea(double length, double breadth) 
{

	return length * breadth;
}

@Override
public double SquareArea(double side) 
{
	return side * side;
}

@Override
public double CircleArea(double radius) 
{
	return Math.PI * radius * radius;
}

}

public class AreaO11 
{
 public static void main(String[] args) 
 {
    
     Area a = new Area();
     double length = 5, breadth = 6;
     System.out.println("Area of Rectangle : " + a.RectangleArea(length, breadth));

     double side = 42;
     System.out.println("Area of Square : " + a.SquareArea(side));

     double radius = 5.5;
     System.out.println("Area of Circle : " + a.CircleArea(radius));
 }
}
