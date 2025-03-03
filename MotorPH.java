/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorph;

import java.util.Scanner;

/**
 *
 * @author franz
 */
import java.util.Scanner;

public class MotorPH {
    public void greetUser() { // greet the user
        System.out.println("Welcome to MotorPH!");
    }

    public void individualComputation(Scanner scanner) { // individual computation page
        System.out.println("\n** Individual Computation **");
        System.out.println("Hours Worked: ");
        System.out.println("Salary: ");
        System.out.println("Deductions: ");

        mainMenuOptions(scanner);
    }

    public void overallComputation(Scanner scanner) { // overall computation page
        System.out.println("\n** Overall Computation **");
        System.out.println("Total Hours Worked: ");
        System.out.println("Overall Salary: ");
        System.out.println("Overall Deductions: ");

        System.out.println("SSS: ");
        System.out.println("PhilHealth: ");
        System.out.println("Pag-Ibig: ");
        System.out.println("Income Tax: ");

        mainMenuOptions(scanner);
    }

    public void mainMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Individual Computation");
            System.out.println("2. Overall Computation");
            System.out.println("3. Exit");
            System.out.print("Select (Type 1, 2, or 3): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid. Please enter a number (1, 2, or 3).");
                scanner.next(); // discard invalid input
                continue;
            }

            int option = scanner.nextInt();

            if (option == 1) {
                individualComputation(scanner);
            } else if (option == 2) {
                overallComputation(scanner);
            } else if (option == 3) {
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid. Please enter 1, 2, or 3.");
            }
        }
    }

    private void mainMenuOptions(Scanner scanner) {
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Return to Main Menu");
            System.out.println("2. Exit");
            System.out.print("Select (Type 1 or 2): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid. Please enter 1 or 2.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 1) {
                return; // go back to main menu
            } else if (choice == 2) {
                System.out.println("Exiting program. Goodbye!");
                System.exit(0); // exits the program
            } else {
                System.out.println("Invalid. Please enter 1 or 2.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MotorPH motorPH = new MotorPH();
        motorPH.greetUser();

        int employeeNumber;
        while (true) {
            System.out.print("Enter your Employee ID: ");
            if (!scanner.hasNextInt()) { // checks if input is an integer
                System.out.println("Invalid. Please enter a valid 5-digit Employee ID.");
                scanner.next(); // checks if input is invalid or a letter 
                continue; // continues the loop
            }

            employeeNumber = scanner.nextInt();

            if (employeeNumber >= 10001 && employeeNumber <= 10034) { // limits input range 
                break;
            } else {
                System.out.println("Invalid. Employee ID must be exactly 5 digits.");
            }
        }

        System.out.println("Hello, Employee #" + employeeNumber + "!\n");

        motorPH.mainMenu(scanner); // redirects to main menu 

        scanner.close();
    }
}

