/*W.A.J.P to create a class Student with attributes roll no, name, age and course.
Initialize values through parameterized constructor. If age of student is not in
between 15 and 21 then generate user defined exception
"AgeNotWithinRangeException". If name contains numbers or special symbols
raise exception "NameNotValidException". Define the two exception classes.*/


package com.corejavaAssigment2;

class AgeNotWithinRangeException extends Exception 
{
 public AgeNotWithinRangeException(String message) 
 {
     super(message);
 }
}
class NameNotValidException extends Exception 
{
 public NameNotValidException(String message) 
 {
     super(message);
 }
}
class Student 
{
 private int rollNo;
 private String name;
 private int age;
 private String course;

 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException 
 {
     if (age < 15 || age > 21) 
     {
         throw new AgeNotWithinRangeException("Age " + age + " is not within the range of 15 to 21.");
     }
     
     if (!isNameValid(name)) 
     {
         throw new NameNotValidException("Name \"" + name + "\" contains invalid characters.");
     }

     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }
 private boolean isNameValid(String name) 
 {
     return name.matches("[a-zA-Z ]+");  
 }

 public void display() 
 {
     System.out.println("Roll No : " + rollNo);
     System.out.println("Name : " + name);
     System.out.println("Age : " + age);
     System.out.println("Course : " + course);
 }
}

public class StudentE7 
{
 public static void main(String[] args) 
 {
     try 
     {

         Student student1 = new Student(101, "Yash Chachdiya",17, "Computer Science");
         student1.display();
         Student student2 = new Student(102, "Ankur", 22, "Mathematics");

     } 
     catch (AgeNotWithinRangeException e) 
     {
         System.out.println("Exception: " + e.getMessage());
     } 
     catch (NameNotValidException e) 
     {
         System.out.println("Exception: " + e.getMessage());
     }

     try 
     {
         Student student3 = new Student(103, "Deep123", 19, "Physics");

     } 
     catch (AgeNotWithinRangeException e) 
     {
         System.out.println("Exception : " + e.getMessage());
     } 
     catch (NameNotValidException e) 
     {
         System.out.println("Exception : " + e.getMessage());
     }
 }
}
