package Java.w3resources.Basics1;

import java.util.Scanner;

//36. Write a Java program to compute the distance between two points on the earth's surface.
//        Distance between the two points [ (x1,y1) & (x2,y2)]
//        d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
//        Radius of the earth r = 6371.01 Kilometers
//        Input Data:
//        Input the latitude of coordinate 1: 25
//        Input the longitude of coordinate 1: 35
//        Input the latitude of coordinate 2: 35.5
//        Input the longitude of coordinate 2: 25.5
//        Expected Output
//
//        The distance between those points is: 1480.0848451069087 km
public class Reto36 {

    public static double calc_distancia(double y1 ,double x1 ,double y2 ,double x2){

        double radius=6371.01;
        //d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
        // return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        return radius * Math.acos(Math.sin(Math.toRadians(y1)) * Math.sin(Math.toRadians(y2)) + Math.cos(Math.toRadians(y1)) * Math.cos(Math.toRadians(y2)) * Math.cos(Math.toRadians(x1) - Math.toRadians(x2)));
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la latitud de la primera coordenada:");
        double y1=sc.nextDouble();
        System.out.println("Introduce la longitud de la primera coordenada:");
        double x1=sc.nextDouble();
        System.out.println("Introduce la latitud de la segunda coordenada:");
        double y2=sc.nextDouble();
        System.out.println("Introduce la longitud de la segunda coordenada:");
        double x2=sc.nextDouble();

        System.out.println("La distancia entre las coordenadas es: "+calc_distancia(y1,x1,y2,x2));

    }
}
