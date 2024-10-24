//W.A.J. P to create one thread by extending Thread class in another Class.
package com.corejavaAssigment2;

class MyThread extends Thread 
{

 @Override
 public void run() 
 {
     
     for (int i = 1; i <= 5; i++) 
     {
    	 System.out.println("My Third Thread is.."+i);
         try 
         {
             Thread.sleep(1000); 
         } 
         catch (InterruptedException e) 
         {
             e.printStackTrace();
         }
     }
 }
}

public class ThreadM2 
{
 public static void main(String[] args) 
 {
     MyThread t = new MyThread();
     t.start();
 }
}
