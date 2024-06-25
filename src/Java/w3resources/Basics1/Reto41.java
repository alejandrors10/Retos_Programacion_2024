package Java.w3resources.Basics1;

import java.util.Scanner;

//Write a Java program to print the ASCII value of a given character.
//        Expected Output
//
//        The ASCII value of Z is :90
public class Reto41 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu texto: ");
        char[] array = sc.nextLine().toCharArray();

        System.out.println("El texto traducido a ASCII es: ");
        for (int i = 0; i < array.length; i++) {
            int x=array[i];
            int position=i+1;
            System.out.println(position+"º: "+array[i]+" = "+x+" ");

        }
    }
}

