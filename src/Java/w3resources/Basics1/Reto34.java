package Java.w3resources.Basics1;

import java.util.Scanner;

//34. Write a Java program to compute hexagon area.
//        Area of a hexagon = (6 * s^2)/(4*tan(π/6))
//        where s is the length of a side
//        Input Data:
//        Input the length of a side of the hexagon: 6
//        Expected Output
//
//        The area of the hexagon is: 93.53074360871938
public class Reto34 {

    public static double calcular_area_hex(int s){

        return (6*Math.pow(s,2))/(4*Math.tan(Math.PI/6));
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la longitud del lado:");
        int a=sc.nextInt();

        System.out.println("El área del hexágono es: "+calcular_area_hex(a));

    }
}
