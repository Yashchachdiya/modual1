/*Create a class with a method that prints "This is a parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of
the class and call 1 - method of parent class by object of parent class 2 - method of
child class by object of child class 3 - method of parent class by object of child class*/

package com.corejavaAssigment2;


class Parent
{
	 public void print() 
	 {
	     System.out.println("This is a parent class");
	 }
}

class Child extends Parent
{
	 public void display() 
	 {
	     System.out.println("This is a child class");
	 }
}
public class InherirenceO2 
{
	public static void main(String[] args) 
	{
		Parent p = new Parent();
	     p.print(); 
	     Child c = new Child();
	     c.display();
	     c.display(); 	
	}

}
