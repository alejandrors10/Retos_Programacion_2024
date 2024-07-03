package Java.w3resources.Basics1;

import java.util.Scanner;

//58. Write a Java program to capitalize the first letter of each word in a sentence.
//        Sample Output:
//
//        Input a Sentence: the quick brown fox jumps over the lazy dog.
//        The Quick Brown Fox Jumps Over The Lazy Dog.
public class Reto58 {

    public static void main(String[] args) {

        Scanner sc=new Scanner((System.in));
        System.out.println("Introduce la frase en minúsculas: ");
        String linea=sc.nextLine();

        String linea_capitalizada="";

        Scanner scLinea=new Scanner(linea);

        while(scLinea.hasNext()){
            String palabra=scLinea.next();
            linea_capitalizada+=Character.toUpperCase(palabra.charAt(0))+palabra.substring(1)+" ";
            }

        System.out.println("El texto capitalizado es: "+linea_capitalizada.trim());
    }

}
