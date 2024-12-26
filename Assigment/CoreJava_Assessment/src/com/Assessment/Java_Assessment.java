package com.Assessment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class Java_Assessment 
{

 
    static class Book 
    {
        String category;
        int bookId;
        String bookName;
        String author;
        int quantity;
        double price;
        int rackNo;

        Book(String category, int bookId, String bookName, String author, int quantity, double price, int rackNo) 
        {
            this.category = category;
            this.bookId = bookId;
            this.bookName = bookName;
            this.author = author;
            this.quantity = quantity;
            this.price = price;
            this.rackNo = rackNo;
        }
    }


    static ArrayList<Book> books = new ArrayList<>();
   
    static HashSet<Integer> bookIds = new HashSet<>();

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

 
        while (true) 
        {
            System.out.println("\nMAIN MENU");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Search Book");
            System.out.println("4. View Book List");
            System.out.println("5. Change Password");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    deleteBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    viewBookList();
                    break;
                case 5:
                    changePassword();
                    break;
                case 6:
                    exitApplication();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

   
    static void addBook() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); 

       
        if (bookIds.contains(bookId)) 
        {
            System.out.println("Book ID already exists. Please enter a unique ID.");
            return;
        }

        System.out.print("Enter Book Name : ");
        String bookName = scanner.nextLine();
        System.out.print("Enter Author : ");
        String author = scanner.nextLine();
        System.out.print("Enter Quantity : ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter Price : ");
        double price = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter Rack No : ");
        int rackNo = scanner.nextInt();
        scanner.nextLine(); 

     
        String category = "";
        if (rackNo >= 1 && rackNo <= 10) 
        {
            category = "Computer";
            
        } 
        else if (rackNo >= 11 && rackNo <= 20) 
        {
            category = "Electronics";
            
        } 
        else if (rackNo >= 21 && rackNo <= 30)
        {
            category = "Electrical";
        } 
        else if (rackNo >= 31 && rackNo <= 40) 
        {
            category = "Civil";
        } 
        else if (rackNo >= 41 && rackNo <= 50) 
        {
            category = "Mechanical";
            
        } 
        else if (rackNo >= 51 && rackNo <= 60) 
        {
            category = "Architecture";
            
        } 
        else 
        {
            System.out.println("Invalid Rack No. Please enter a valid Rack No.");
            return;
        }

        books.add(new Book(category, bookId, bookName, author, quantity, price, rackNo));
        bookIds.add(bookId); 
        System.out.println("Book added successfully!");
    }

  
    static void deleteBook() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book ID to delete: ");
        int bookId = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < books.size(); i++) 
        {
            if (books.get(i).bookId == bookId) 
            {
                books.remove(i);
                bookIds.remove(bookId);
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    
    static void searchBook() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSEARCH OPTIONS");
        System.out.println("1. Search By ID");
        System.out.println("2. Search By Name");
        System.out.print("Enter Your Choice: ");

        int searchChoice = scanner.nextInt();
        scanner.nextLine(); 

        if (searchChoice == 1) 
        {
            System.out.print("Enter Book ID to search: ");
            int bookId = scanner.nextInt();
            scanner.nextLine();

            for (Book book : books) 
            {
                if (book.bookId == bookId) 
                {
                    System.out.println("Book Found :");
                    System.out.println("Category : " + book.category);
                    System.out.println("Book ID : " + book.bookId);
                    System.out.println("Book Name : " + book.bookName);
                    System.out.println("Author : " + book.author);
                    System.out.println("Quantity : " + book.quantity);
                    System.out.println("Price : " + book.price);
                    System.out.println("Rack No : " + book.rackNo);
                    return;
                }
            }
            System.out.println("Book not found.");
        } else if (searchChoice == 2) 
        {
            System.out.print("Enter Book Name to search: ");
            
            String bookName = scanner.nextLine();

            boolean found = false;
            for (Book book : books) 
            {
                if (book.bookName.equalsIgnoreCase(bookName)) 
                {
                    System.out.println("Book Found:");
                    System.out.println("Category: " + book.category);
                    System.out.println("Book ID: " + book.bookId);
                    System.out.println("Book Name: " + book.bookName);
                    System.out.println("Author: " + book.author);
                    System.out.println("Quantity: " + book.quantity);
                    System.out.println("Price: " + book.price);
                    System.out.println("Rack No: " + book.rackNo);
                    found = true;
                }
            }
            if (!found) 
            {
                System.out.println("Book not found.");
                
            }
        } 
        else 
        {
            System.out.println("Invalid search choice.");
        }
    }

 
    static void viewBookList() 
    {
        if (books.isEmpty()) 
        {
            System.out.println("No books in the library.");
            
        } 
        else 
        {
            System.out.println("CATEGORY\t\tID\t\tBOOK NAME\t\tAUTHOR\t\tQTY\t\tPRICE\t\tRACK NO");
            for (Book book : books) 
            {
                System.out.println(book.category + "\t\t" + book.bookId + "\t\t" + book.bookName + "\t\t" + book.author + "\t\t" + book.quantity + "\t\t" + book.price + "\t\t" + book.rackNo);
                
            }
        }
    }

    static void changePassword() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Old Password: ");
        String oldPassword = scanner.nextLine();


        if (oldPassword.equals("your_old_password")) 
        { 
            System.out.print("Enter New Password: ");
            String newPassword = scanner.nextLine();
            
            System.out.println("Password changed successfully!");
            
        }
        else 
        {
            System.out.println("Incorrect current password.");
            
        }
    }

 
    static void exitApplication() 
    {
    	
        System.out.println("Exiting in 3 seconds...");
        
        try {
            Thread.sleep(3000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("Exiting...");
        System.exit(0);
    }
}
