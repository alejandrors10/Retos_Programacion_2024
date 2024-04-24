package Java.w3resources.Basics1;

import java.util.Scanner;

/*
Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
*/
public class Reto12 {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("introduce el primer número : ");
        float a = input.nextFloat();
        System.out.print("introduce el segundo número : ");
        float b = input.nextFloat();
        System.out.print("introduce el tercer número : ");
        float c = input.nextFloat();

        float promedio= (a+b+c)/3;
        System.out.println(promedio);

    }
}
