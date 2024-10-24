package com.corejavaAssigment2;

class Shape1 
{

 public void printShape() 
 {
     System.out.println("This is shape");
 }
}

class Rectangle1 extends Shape1 
{

 public void printRectangle() 
 {
     System.out.println("This is rectangular shape");
 }
}

class Circle extends Shape1 
{
 
 public void printCircle() 
 {
     System.out.println("This is circular shape");
 }
}

class Square12 extends Rectangle1 
{
 
 public void printSquare() 
 {
     System.out.println("Square is a rectangle");
 }
}

public class ShapeO13 
{
 public static void main(String[] args) 
 {
    
     Square12 s = new Square12();
     s.printShape();    
     s.printRectangle();   
     s.printSquare();      
 }
}
