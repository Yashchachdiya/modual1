/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
two methods to print the area and perimeter of the rectangle respectively. Its
constructor having parameters for length and breadth is used to initialize the length
and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
constructor having a parameter for its side (suppose s) calling the constructor of its
parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.*/

package com.corejavaAssigment2;

class Rectangle 
{
   int length, breadth;

 Rectangle(int l, int b) 
  {
     length = l;      
     breadth = b;    
  }

 public void printArea() 
  {
     int area = length * breadth;
     System.out.println("Area of Rectangle: " + area);
  }

 public void printPerimeter() 
 {
     int perimeter = 2 * (length + breadth);
     System.out.println("Perimeter of Rectangle: " + perimeter);
 }
}

class Square extends Rectangle 
{

 Square(int s) 
  {
	 
     super(s, s);  
  }
}


public class SquareO4 
{
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(10, 5);
	     r.printArea();      
	     r.printPerimeter(); 

	     Square s = new Square(4);
	     s.printArea();        
	     s.printPerimeter(); 
		
	}

}
