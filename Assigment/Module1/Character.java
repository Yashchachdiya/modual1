/*
Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel or Consonant, depending on the user input. If the user input
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
message.

*/
package corejavaAssigment1;
import java.util.Scanner;
public class Character 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character :");
		char character =sc.next().charAt(0);

		if (character == 'a' || character =='e' || character == 'i' || character == 'o' || character == 'u') 
		  {
              System.out.println(character + " is a vowel.");
          } 
	    else 
          {
              System.out.println(character + " is a consonant.");
          }
		
	}

}
