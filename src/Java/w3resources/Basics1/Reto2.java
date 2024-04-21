package Java.w3resources.Basics1;

/*2. Write a Java program to print the sum of two numbers.
        Test Data:
        74 + 36
        Expected Output :
        110*/

import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        // Creamos el escáner
        Scanner input = new Scanner(System.in);

        System.out.print("introduce el primer sumando: ");
        int num1 = Integer.parseInt(input.next());

        System.out.print("Introduce el segundo sumando: ");
        int num2 = Integer.parseInt(input.next());

        int resultado=num1+num2;

        System.out.println("\nEl resultado es: " + resultado);
    }
}

