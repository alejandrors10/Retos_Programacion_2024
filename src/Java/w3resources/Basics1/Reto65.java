package Java.w3resources.Basics1;

import java.util.Scanner;

//65. Write a Java program to calculate the modules of two numbers without using any inbuilt modulus operator.
//        Sample Output:
//
//        Input the first number : 19
//        Input the second number: 7
//        5
public class Reto65 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int b = sc.nextInt();

        while(a>b){
            a=a-b;
        }
        if(a==b){
            System.out.println("El resto es 0");
        }else{
            System.out.println("El resto es "+a);
        }
    }
}
