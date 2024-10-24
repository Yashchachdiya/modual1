/*W.A.J.P to create 2 threads and execute that threads by providing sleep time as
2000ms and check the execution.*/

package com.corejavaAssigment2;

class MThread extends Thread 
{
 private String threadName;


 public MThread(String name) 
 {
     this.threadName = name;
 }

 @Override
 public void run() 
 {
     try 
     {
         System.out.println(threadName + " is running");
         Thread.sleep(2000);  
         System.out.println(threadName + " is Compeleted");
     } 
     catch (InterruptedException e) 
     {
         e.printStackTrace();
     }
 }
}

public class ThM3 
{
 public static void main(String[] args) 
 {
    
     MThread t1 = new MThread("Thread 1");
     MThread t2 = new MThread("Thread 2");

     t1.start();
     t2.start();
 }
}
