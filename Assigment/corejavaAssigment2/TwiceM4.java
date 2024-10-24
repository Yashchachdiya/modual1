/*W.A.J.P to start the same Thread twice by calling start () method twice. Test
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();*/

package com.corejavaAssigment2;

class TestThreadTwice1 extends Thread 
{
 
 @Override
 public void run() 
 {
     System.out.println(Thread.currentThread().getName() + " is running...");
 }
}

public class TwiceM4 
{
 public static void main(String[] args) 
 {
    
     TestThreadTwice1 t1 = new TestThreadTwice1();
     t1.start();

     try 
     {
         System.out.println("start the thread again...");
         t1.start();  

     } 
     catch (IllegalThreadStateException e) 
     {
         TestThreadTwice1 t2 = new TestThreadTwice1();
         t2.start();
     }
 }
}
