package com.corejavaAssigment2;

abstract class Marks 
{
	public abstract double getPercentage();
 
}
class A extends Marks 
{
	  int sub1, sub2, sub3;
	 
	 public A(int s1, int s2, int s3) 
	 {
	    sub1=s1;
	    sub2=s2;
	    sub3=s3;

     }
 @Override
 public double getPercentage() 
 {
     int total = sub1 + sub2 + sub3;
     return (total / 3); 
 }
}

class B extends Marks 
{
	 int sub1, sub2, sub3, sub4;
	 
	
	 public B(int subject1, int subject2, int subject3, int subject4) 
	 {
		 sub1=subject1;
		 sub2=subject2;
		 sub3=subject3;
		 sub4=subject4;
     }

 @Override
 public double getPercentage() 
 {
     int total = sub1 + sub2 + sub3 + sub4;
     return (total / 4); 
 }
}

public class MarksO9 
{
 public static void main(String[] args) 
 {
   
     Marks a = new A(89, 98,78);
     System.out.println("Percentage of Student A : " + a.getPercentage() + "%");
     
     Marks b = new B(67,97,96,87);
     System.out.println("Percentage of Student B : " + b.getPercentage() + "%");
 }
}
