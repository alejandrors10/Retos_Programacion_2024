package Java.w3resources.Basics1;

import java.util.Scanner;

//61. Write a Java program to reverse a word.
//        Sample Output:
//
//        Input a word: dsaf
//        Reverse word: fasd
public class Reto61 {

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        System.out.println("Introduce la palabra: ");
        String palabra = sc.nextLine();
        String palabra_reversa="";

        for(int i=palabra.length()-1;i>=0;i--){
            palabra_reversa=palabra_reversa+palabra.charAt(i);
        }
        System.out.println("Palabra al revés: "+palabra_reversa);

    }
}
