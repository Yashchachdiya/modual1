/*W.A.J. P to create one thread by implementing Runnable interface in
Class.*/
package com.corejavaAssigment2;

class Second implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			try 
			{
			   Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
		     }
			System.out.println("My Second Thread is.."+i);
	    }
		System.out.println("My Second Thread is Compeleted..");
		
		
	}
	
}
public class RunM1 
{
	public static void main(String[] args) 
	{
		Second s1=new Second();
		Thread t1=new Thread(s1);
		t1.start();
		for(int i=1;i<=5;i++)
		{
			try 
			{
			   Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
		     }
			System.out.println("My Main Thread is.."+i);
	    }
		System.out.println("My Main Thread is Compeleted..");
		
	}

}
