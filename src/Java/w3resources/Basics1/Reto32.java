package Java.w3resources.Basics1;

import java.sql.SQLOutput;
import java.util.Scanner;

//32. Write a Java program to compare two numbers.
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//
//        25 != 39
//        25 < 39
//        25 <= 39
public class Reto32 {


    public static String comparar(int a,int b){
        String primero,segundo,tercero;

        if(a==b){
            primero=a+" = "+b;
        }else{
            primero=a+" != "+b;
        }
        if(a>b){
            segundo=a+" > "+b;
        } else if (a<b) {
            segundo=a+" < "+b;
        }else {
            segundo=a+" = "+b;
        }
        if(a>=b){
            tercero=a+" >= "+b;
        }else{
            tercero=a+" < "+b;
        }

        String s = primero + "\n" + segundo + "\n" + tercero;

        return s;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int a=sc.nextInt();
        System.out.println("Introduce el segundo número:");
        int b=sc.nextInt();

        System.out.println(comparar(a,b));
    }
}
