package Java.w3resources.Basics1;

/*Write a Java program to print the area and perimeter of a rectangle.*/

import java.util.Scanner;

public class Reto13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("introduce la base : ");
        float b = input.nextFloat();
        System.out.print("introduce la altura : ");
        float h = input.nextFloat();

        float area= b*h;
        float perim= 2*(b+h);

        System.out.printf("\nEl área es: %.1f \nEl perímetro es: %.1f",area,perim);

    }
}
