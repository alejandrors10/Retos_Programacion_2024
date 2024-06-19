package Java.w3resources.Basics1;

//Write a Java program to compute the area of a polygon.
//        Area of a polygon = (n*s^2)/(4*tan(π/n))
//        where n is n-sided polygon and s is the length of a side
//        Input Data:
//        Input the number of sides on the polygon: 7
//        Input the length of one of the sides: 6
//        Expected Output
//
//        The area is: 130.82084798405722

import java.util.Scanner;

public class Reto35 {

    public static double calc_areaPoligono(int s,int n){

        //(n*s^2)/(4*tan(π/n))
        return (n*Math.pow(s,2))/(4*Math.tan(Math.PI/n));
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la longitud del lado:");
        int a=sc.nextInt();
        System.out.println("Introduce el número de lados");
        int b=sc.nextInt();

        System.out.println("El área del polígono es: "+calc_areaPoligono(a,b));

    }
}
