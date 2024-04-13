/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

                // Todo 7: Create two classes for Freshman and Senior 

                // ToDo 8: The senior class should have a minimum of 85 credits  
	 double gpaInput = 0.0;
	 boolean validInput = false;

	 Scanner scanner = new Scanner(System.in);
	 while (!validInput) {
		 try {
			 System.out.print("Enter GPA for std1: ");
			 gpaInput = scanner.nextDouble();
			 validInput = true;
		 } catch (InputMismatchException e) {
			 System.out.println("Invalid input. Please enter a valid GPA.");
			 scanner.nextLine(); // Consume the invalid input to avoid an infinite loop
		 }
	 }
	 // ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class
		// ToDo 11: Add a toString method for the Senior class
	 Student std1 = new Student("James", (short) 20, "123 Main St", gpaInput); // name, age, address, gpa

	 Freshman std2 = new Freshman("Max", (short) 20, 3.2, 12); // name, age, gpa, credits

	 Senior std3 = new Senior("John", (short) 30, 3.8, 90); // name, age, gpa, credits


	 // ToDo 12: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);

		// ToDo 13: add comments and explain your code

	}

}
