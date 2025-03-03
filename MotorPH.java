/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorph;

import java.util.Scanner;

/**
 *
 * @author franz
 */
public class MotorPH {
    public void greetUser() { // greet the user
            System.out.println("Welcome to MotorPH!");
            
    }
    
    public void individualComputation(Scanner scanner) {
        // add computation code here
        
        String lineBreak = System.lineSeparator();
        System.out.println(lineBreak); 
        
        System.out.println(" ** Individual Computation Page ** ");
        System.out.println("Hours Worked: ");
        System.out.println("Salary: ");
        System.out.println("Deductions: ");

        System.out.println("Choose an option: ");
        System.out.println("1. Return to Main Menu");
        System.out.println("2. Exit");
        
        int choice = scanner.nextInt();
        if (choice == 1) {
            mainMenu(scanner); // return to main menu
        } else {
            System.out.println("Exiting program. Goodbye!");
            System.exit(0); // terminate program
        }
    }

    public void overallComputation(Scanner scanner) {
        // add computation code here
        
        String lineBreak = System.lineSeparator();
        System.out.println(lineBreak); 
        
        System.out.println(" ** Overall Computation Page ** ");
        System.out.println("Total Hours Worked: ");
        System.out.println("Overall Salary: ");
        System.out.println("Overall Deductions: ");
        
        System.out.println("SSS: ");
        System.out.println("PhilHealth: ");
        System.out.println("Pag-Ibig: ");
        System.out.println("Income Tax: ");

        System.out.println("Choose an option: ");
        System.out.println("1. Return to Main Menu");
        System.out.println("2. Exit");

        int choice = scanner.nextInt();
        if (choice == 1) {
            mainMenu(scanner); // return to main menu
        } else {
            System.out.println("Exiting program. Goodbye!");
            System.exit(0); // terminate program
        }
    }

    public void mainMenu(Scanner scanner) {
        int option;
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Individual Computation");
            System.out.println("2. Overall Computation");
            System.out.print("Select Calculation Category (Type 1 or 2): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next();
                continue;
            }

            option = scanner.nextInt();
            if (option == 1) {
                individualComputation(scanner);
                break;
            } else if (option == 2) {
                overallComputation(scanner);
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // scanner object
        MotorPH motorPH = new MotorPH();
        motorPH.greetUser();
                
        // employee inputs ID number
        
        int employeeNumber;
        while (true) {
            System.out.print("Enter your Employee ID: ");
            if (!scanner.hasNextInt()) { // checks if next input is an integer
                System.out.println("Invalid input. Please enter a valid 5-digit Employee ID.");
                scanner.next(); // checks if input is invalid or a letter
                continue; // asks for the input again
            }
            
            employeeNumber = scanner.nextInt();
            
            if (employeeNumber >= 10000 && employeeNumber <= 10034) { // checks if input is 5-digits only
                break;
            } else {
                System.out.println("Invalid input. Employee ID must be exactly 5 digits.");
            }
        }
     
           System.out.println("Hello, Employee #" + employeeNumber + "!");
           
        String lineBreak = System.lineSeparator();
        System.out.println(lineBreak); 
        
        // employee chooses between two options
        int option;
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Individual Computation");
            System.out.println("2. Overall Computation");
            System.out.print("Select Calculation Category (Type 1 or 2): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number (1 or 2).");
                scanner.next(); 
                continue; 
            }
       
       motorPH.mainMenu(scanner);
       
       scanner.close();
           
        }
    }
}
