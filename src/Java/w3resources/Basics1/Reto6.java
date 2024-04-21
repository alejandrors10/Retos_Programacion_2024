package Java.w3resources.Basics1;
import java.util.Scanner;

/*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5*/
public class Reto6 {
    public static void main(String[] args) {
        // Creamos el escáner
        Scanner input = new Scanner(System.in);

        System.out.print("introduce el primer número : ");
        int num1 = Integer.parseInt(input.next());

        System.out.print("Introduce el segundo número: ");
        int num2 = Integer.parseInt(input.next());

        int suma = num1 + num2;
        int resta = num1 - num2;
        int producto = num1 * num2;
        float cociente = (float) num1 / num2;
        int resto= num1%num2;

        System.out.println("\nLa suma es: " + suma);
        System.out.println("\nLa resta es: " + resta);
        System.out.println("\nEl producto es: " + producto);
        System.out.println("\nEl cociente es: " + cociente);
        System.out.println("\nEl resto es: " + resto);
    }
}
