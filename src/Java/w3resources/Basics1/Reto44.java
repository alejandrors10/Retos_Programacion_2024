package Java.w3resources.Basics1;

import java.util.Scanner;

//44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
//        Sample Output:
//
//        Input number: 5
//        5 + 55  + 555
public class Reto44 {

    public static void main(String[] args) {
        int cifra;
        Scanner sc=new Scanner((System.in));
        cifra=sc.nextInt();

        int resultado=cifra+(cifra*10+cifra)+(cifra*100+cifra*10+cifra);
        System.out.println("Cifra de entrada: "+cifra+"\nCálculo: "+cifra+" + "+cifra+cifra+" + "+cifra+cifra+cifra+"\nResultado: "+resultado);
    }
}
