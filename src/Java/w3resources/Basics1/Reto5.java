package Java.w3resources.Basics1;

import java.util.Scanner;

/*5. Write a Java program that takes two numbers as input and displays the product of two numbers.
        Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output :
        25 x 5 = 125*/

public class Reto5 {
    public static void main(String[] args) {
        // Creamos el escáner
        Scanner input = new Scanner(System.in);

        System.out.print("introduce un factor : ");
        int num1 = Integer.parseInt(input.next());

        System.out.print("Introduce otro factor: ");
        int num2 = Integer.parseInt(input.next());

        int resultado = num1 * num2;

        System.out.println("\nEl producto es: " + resultado);
    }
}