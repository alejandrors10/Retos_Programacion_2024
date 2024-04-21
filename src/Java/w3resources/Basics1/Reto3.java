package Java.w3resources.Basics1;

import java.util.Scanner;

/*Write a Java program to divide two numbers and print them on the screen.
        Test Data :
        50/3
        Expected Output :
        16*/
public class Reto3 {
    public static void main(String[] args) {
        // Creamos el escáner
        Scanner input = new Scanner(System.in);

        System.out.print("introduce el dividendo : ");
        int num1 = Integer.parseInt(input.next());

        System.out.print("Introduce el divisor: ");
        int num2 = Integer.parseInt(input.next());

        float resultado=(float)num1/num2;

        System.out.println("\nEl cociente es: " + resultado);
    }
}