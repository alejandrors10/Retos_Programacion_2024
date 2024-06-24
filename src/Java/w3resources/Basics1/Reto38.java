package Java.w3resources.Basics1;

import java.util.Scanner;

//38. Write a Java program to count letters, spaces, numbers and other characters in an input string.
//        Expected Output
//
//        The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
//        letter: 23
//        space: 9
//        number: 10
//        other: 6
public class Reto38 {

    public static void main(String[] args) {

        int letras = 0;
        int num = 0;
        int espac = 0;
        int otros = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu texto: ");
        char[] array = sc.nextLine().toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i])) {
                letras++;
            } else if (Character.isDigit(array[i])) {
                num++;
            } else if (Character.isSpace(array[i])) {
                espac++;
            } else {
                otros++;
            }
        }

        System.out.println("\nRecuento de caracteres: \n" + "Letras: " + letras + "\nNúmeros: " + num + "\nEspacios: " + espac + "\nOtros: " + otros);
    }
}
