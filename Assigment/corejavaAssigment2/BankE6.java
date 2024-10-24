package com.corejavaAssigment2;

import java.util.Scanner;

class Yash extends Exception
{
	double amount;
	public Yash(double amount) 
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance +=amount;
		System.out.println(amount+" rs Deposited..");
	}
	public void withdrawal(double amount) throws Yash
	{
		if(amount <= balance)
		{
			balance -= amount;
			System.out.println(amount+" rs withdrawal successfully..");
		}
		else
		{
			double needs=amount-balance;
			throw new Yash(needs);
		}
	}
}

public class BankE6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ATM a1=new ATM();
		System.out.println("Enter Amount for deposit : ");
		double amount=sc.nextDouble();
		a1.deposit(amount);
		System.out.println("Enter Amount for withdrawal : ");
		amount=sc.nextDouble();
		try 
		{
			a1.withdrawal(amount);
		} catch (Yash e)
		{
			System.out.println("If you entered "+e.amount+ "rs then you withdrawal "+amount +" rs");
		}
		
	}

}