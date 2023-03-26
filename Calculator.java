//Author: GCBlake
//Date: 26/03/23

import java.util.Scanner; // Import the Scanner class

public class Calculator {

  public static void main(String[] args) {
    System.out.println("-----Java Calculator-----"); // Print a welcome message
    Scanner scanner = new Scanner(System.in); // Create a Scanner object
    char operator; // Declare operator variable
    double num1, num2, result; // Declare number and result variables
    boolean repeat = true; // Declare a variable to control program repetition

    while (repeat) { // Use a while loop to repeat the program until user stops

      System.out.print("Enter first number: "); // Prompt user for first number
      num1 = scanner.nextDouble(); // Read first number

      System.out.print("Enter operator (+, -, *, /): "); // Prompt user for operator
      operator = scanner.next().charAt(0); // Read operator

      System.out.print("Enter second number: "); // Prompt user for second number
      num2 = scanner.nextDouble(); // Read second number

      switch (operator) { // Use switch to perform calculation based on operator
      case '+':
        result = num1 + num2; // Add the two numbers together
        break;
      case '-':
        result = num1 - num2; // Subtract the second number from the first number
        break;
      case '*':
        result = num1 * num2; // Multiply the two numbers together
        break;
      case '/':
        result = num1 / num2; // Divide the first number by the second number
        break;
      default:
        System.out.println("Invalid operator"); // Print an error message
        continue; // Skip to next iteration of loop
      }

      System.out.println(num1 + " " + operator + " " + num2 + " = " + result); // Print calculation result

      System.out.print("Do you want to perform another calculation? (Y/N) "); // Prompt user to perform another calculation
      char choice = scanner.next().charAt(0); // Read user's choice
      repeat = (choice == 'Y' || choice == 'y'); // Set repeat variable to true or false
    }

    scanner.close(); // Close the Scanner object
  }

}