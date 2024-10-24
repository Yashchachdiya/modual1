package com.corejavaAssigment2;

class TestDaemonThread2 extends Thread 
{
 @Override
 public void run() 
 {
     if (Thread.currentThread().isDaemon()) 
     {
         System.out.println(Thread.currentThread().getName() + " is a daemon thread.");
     } 
     else 
     {
         System.out.println(Thread.currentThread().getName() + " is a user thread.");
     }
 }
}

public class DemonstratesM5 
{
 public static void main(String[] args) 
 {
     TestDaemonThread2 t1 = new TestDaemonThread2();
     TestDaemonThread2 t2 = new TestDaemonThread2(); 
     t1.start(); 
     try 
     {
         t1.setDaemon(true);  
     } 
     catch (IllegalThreadStateException e) 
     {
         System.out.println("Cannot set thread daemon after it has been started");
     }
     t2.setDaemon(true);
     t2.start();  
 }
}
