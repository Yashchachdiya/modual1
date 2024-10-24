package com.corejavaAssigment2;

public class SequenceS13 
{

    public void print(int n, char c) 
    {
        System.out.println("Integer : " + n + ", Character : " + c);
    }

    public void print(char c, int n) 
    {
        System.out.println("Character : " + c + ", Integer : " + n);
    }

    public static void main(String[] args) 
    {
    	SequenceS13 s = new SequenceS13();
        
        s.print(102, 'Y');  
        s.print('A', 204);  
    }
}
