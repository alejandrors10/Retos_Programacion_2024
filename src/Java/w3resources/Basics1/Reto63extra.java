package Java.w3resources.Basics1;

import java.util.Scanner;

//63. Write a Java program that accepts two integer values from the user and returns the largest value. However if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.
//        Sample Output:
//
//        Input the first number : 12
//        Input the second number: 13
//        Result: 13
public class Reto63extra {
        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner in = new Scanner(System.in);

            // Prompt the user to input the first number
            System.out.print("Input the first number : ");
            int a = in.nextInt();  // Read and store the first number

            // Prompt the user to input the second number
            System.out.print("Input the second number: ");
            int b = in.nextInt();  // Read and store the second number

            // Call the result method with the two numbers and print the result
            System.out.println("Result: " + result(a, b));
        }

        // Define a method to calculate the result based on two input numbers
        public static int result(int x, int y) {
            // Check if the two numbers are equal
            if (x == y) {
                return 0;
            }

            // Check if the remainder when divided by 6 is the same for both numbers
            if (x % 6 == y % 6) {
                // If the remainder is the same, return the smaller number
                return (x < y) ? x : y;
            }

            // If the remainders are different, return the larger number
            return (x > y) ? x : y;
        }
    }

