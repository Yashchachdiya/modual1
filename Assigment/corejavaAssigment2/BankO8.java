/*Create an abstract class'Bank' with an abstract method 'getBalance'. $100, $150 and
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'are
subclasses of class 'Bank', each having a method named 'getBalance'. Call this
method by creating an object of each of the three classes.*/

package com.corejavaAssigment2;


abstract class Bank 
{
    public abstract int getBalance();
	
}


class BankA extends Bank 
{
   int balance = 100;

@Override
public int getBalance() 
{
	 return balance;
	
}

}

class BankB extends Bank 
{
   int balance = 150;

@Override
public int getBalance() 
{

	return balance;
}


}

class BankC extends Bank 
{
    int balance = 200;

	@Override
	public int getBalance() 
	{
		return balance;
	}


}
public class BankO8 
{
	public static void main(String[] args) 
	{
		 Bank a = new BankA();
	     Bank b = new BankB();
	     Bank c = new BankC();
	   
	     System.out.println("Balance in BankA : $" + a.getBalance());
	     System.out.println("Balance in BankB : $" + b.getBalance());
	     System.out.println("Balance in BankC : $" + c.getBalance());
	}

}



