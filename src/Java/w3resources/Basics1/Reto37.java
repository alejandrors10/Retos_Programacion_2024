package Java.w3resources.Basics1;

import java.util.Scanner;

//37. Write a Java program to reverse a string.
//        Input Data:
//        Input a string: The quick brown fox
//        Expected Output
//
//        Reverse string: xof nworb kciuq ehT
public class Reto37 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu texto: ");
        char[] array = sc.nextLine().toCharArray();

        System.out.print("El texto escrito del revés: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
