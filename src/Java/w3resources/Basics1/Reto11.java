package Java.w3resources.Basics1;

import java.util.Scanner;

/*Write a Java program to print the area and perimeter of a circle.
        Test Data:
        Radius = 7.5
        Expected Output
        Perimeter is = 47.12388980384689
        Area is = 176.71458676442586*/

    public class Reto11 {
        public static void main(String[] args) {

            double pi=Math.PI;

            // Creamos el escáner
            Scanner input = new Scanner(System.in);

            System.out.print("introduce el radio : ");
            double r = input.nextDouble();
            double perim=2*pi*r;
            double area=pi*r*r;

            System.out.println("\nEl perímetro es: " +perim);
            System.out.println("\nEl área es: " +area);
        }
}
