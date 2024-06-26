package Java.w3resources.Basics1;

import java.util.Scanner;

//52. Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer.
//        Sample Output:
//
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true
public class Reto52 {

    public static void main(String[] args) {

        Scanner sc=new Scanner((System.in));
        boolean suma=false;

        System.out.println("Introduce el primer número");
        int a=sc.nextInt();
        System.out.println("Introduce el segundo número");
        int b=sc.nextInt();
        System.out.println("Introduce el tercer número");
        int c=sc.nextInt();

        if(a+b==c||a+c==b||c+b==a){
            suma=true;
        }
        System.out.println("Un número es suma de los otros dos: "+suma);
    }
}
