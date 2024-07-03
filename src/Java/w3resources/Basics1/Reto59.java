package Java.w3resources.Basics1;

import java.util.Scanner;

//59. Write a Java program to convert a string into lowercase.
//        Sample Output:
//
//        Input a String: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
//        the quick brown fox jumps over the lazy dog.
public class Reto59 {

    public static void main(String[] args) {

        Scanner sc=new Scanner((System.in));
        System.out.println("Introduce la frase en mayúsculas: ");
        String linea=sc.nextLine();

        String linea_minus="";

        Scanner scLinea=new Scanner(linea);

        while(scLinea.hasNext()){
            String palabra=scLinea.next();
            linea_minus+=palabra.toLowerCase()+" ";
        }

        System.out.println("El texto minusculizado es: "+linea_minus.trim());

    }
}
