package Java.w3resources.Basics1;

import java.util.Scanner;

//60. Write a Java program to find the penultimate (next to the last) word in a sentence.
//        Sample Output:
//
//        Input a String: The quick brown fox jumps over the lazy dog.
//        Penultimate word: lazy
public class Reto60 {

    public static void main(String[] args) {

        //Primero escaneamos la frase e insertamos esa línea en otro escáner
        Scanner sc=new Scanner((System.in));
        System.out.println("Introduce la frase: ");
        String linea=sc.nextLine();

        Scanner scLinea=new Scanner(linea);

        //Luego insertamos cada palabra en un array de Strings haciendo un split de la linea quitando espacios con regex
        String array[] =linea.split("[ ]+");

        //Finalmente imprimimos el valor que queremos
        System.out.println("Antepenúltimo valor: "+array[array.length-2]);
    }
}
