package Java.w3resources.Basics1;

import java.util.Scanner;
public class Reto36_extra {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la latitud de la primera coordenada:");
        double lat1=sc.nextDouble();
        System.out.println("Introduce la longitud de la primera coordenada:");
        double lon1=sc.nextDouble();
        System.out.println("Introduce la latitud de la segunda coordenada:");
        double lat2=sc.nextDouble();
        System.out.println("Introduce la longitud de la segunda coordenada:");
        double lon2=sc.nextDouble();

        // Calculate and display the distance between the two coordinates
        System.out.print("La distancia entre los dos puntos es: " + calc_distancia(lat1, lon1, lat2, lon2) + " km\n");
    }

    // Points will be converted to radians before calculation
    public static double calc_distancia(double lat1, double lon1, double lat2, double lon2) {

        // Earth's mean radius in kilometers
        double radio = 6371.01;

        // Calculate the distance using the haversine formula
        return radio * Math.acos(Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(lon1) - Math.toRadians(lon2)));
    }
}


