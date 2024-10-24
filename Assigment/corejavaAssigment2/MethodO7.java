package com.corejavaAssigment2;

abstract class Parent1
{
    public abstract void message();
   
}

class Sub1 extends Parent1 
{
   @Override
   public void message() 
 {
	 
     System.out.println("This is first subclass");
 }
}

class Sub2 extends Parent1 
{
   @Override
   public void message() 
   {
	   
      System.out.println("This is second subclass");
   }
}


public class MethodO7 
{
	public static void main(String[] args) 
	{
		Sub1 s1 = new Sub1();
	    s1.message();  
	    Sub2 s2 = new Sub2();
	    s2.message(); 
		
	}

	
}
