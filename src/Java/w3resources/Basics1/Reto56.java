package Java.w3resources.Basics1;

import java.util.Scanner;

//56. Write a Java program to find the number of values in a given range divisible by a given value.
//        For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
//        Sample Output:
//
//        5
public class Reto56 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el rango");
        int rango1=sc.nextInt();
        int rango2=sc.nextInt();
        System.out.println("Introduce el divisor");
        int divisiblePor=sc.nextInt();

        int contador=0;

        for (int i=rango1;i<rango2+1;i++){
            if(i%divisiblePor==0){
                contador++;
            }
        }
        System.out.println("Números divisibles por "+divisiblePor+" en el rango "+rango1+"-"+rango2+": "+contador);
    }
}
