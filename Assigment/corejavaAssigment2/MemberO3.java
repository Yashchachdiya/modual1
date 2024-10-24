/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members.
*/
package com.corejavaAssigment2;


public class MemberO3 
{
	
	private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public MemberO3(String name, int age, String phoneNumber, String address, double salary) 
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    
    public void printSalary() 
    {
        System.out.println("Salary: " + salary);
    }
    
	public static void main(String[] args) 
	{
		MemberO3 member = new MemberO3("Yash", 21, "8866621231", "Dhoraji", 50000.0);
        member.printSalary();
		
	}

}
