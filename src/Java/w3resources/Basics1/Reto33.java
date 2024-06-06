package Java.w3resources.Basics1;

import java.util.Scanner;

//33. Write a Java program and compute the sum of an integer's digits.
//        Input Data:
//        Input an integer: 25
//        Expected Output
//
//        The sum of the digits is: 7
public class Reto33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        Integer a = sc.nextInt();
        String as = a.toString();

        int resultado = 0;
        for (int i = 0; i < as.length(); i++) {

            resultado = resultado + a%10;
            a = a / 10;
        }

        System.out.println("La suma de los dígitos es: " + resultado);

    }
}
