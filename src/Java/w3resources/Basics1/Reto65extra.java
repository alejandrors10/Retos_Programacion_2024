package Java.w3resources.Basics1;

import java.util.Scanner;

public class Reto65extra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int b = sc.nextInt();

        //Aprovechamos que una división de enteros da el resultado por defecto
        int division = a / b;
        int resultado = a - b * division;

        System.out.println("El resto es: "+resultado);
    }
}
