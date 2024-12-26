package com.model;

import java.util.Scanner;

public class View {

    private Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    // Method to display a message
    public void displayMessage(String message) {
        System.out.println(message);
    }

    // Method to get user details (console-based example)
    public User getUserDetails() {
        System.out.println("Enter first name:");
        String fname = scanner.nextLine();

        System.out.println("Enter last name:");
        String lname = scanner.nextLine();

        System.out.println("Enter email:");
        String email = scanner.nextLine();

        System.out.println("Enter mobile:");
        String mobile = scanner.nextLine();

        User user = new User();
        user.setFname(fname);
        user.setLname(lname);
        user.setEmail(email);
        user.setMobile(mobile);

        return user;
    }

    // Method to get message details (console-based example)
    public Message getMessageDetails() {
        System.out.println("Enter sender email:");
        String from = scanner.nextLine();

        System.out.println("Enter recipient email:");
        String to = scanner.nextLine();

        System.out.println("Enter message:");
        String msg = scanner.nextLine();

        Message message = new Message();
        message.setFrom(from);
        message.setTo(to);
        message.setMsg(msg);

        return message;
    }

    // Clean up resources
    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
