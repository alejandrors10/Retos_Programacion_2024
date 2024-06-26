package Java.w3resources.Basics1;

import java.util.Scanner;

//49. Write a Java program to accept a number and check whether the number is even or not. Prints 1 if the number is even or 0 if odd.
//        Sample Output:
//
//        Input a number: 20
//        1
public class Reto49 {

    public static void main(String[] args) {

        System.out.println("Introduce tu número");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if (num%2==0){
            System.out.println("Tu número es par");
        }else{
            System.out.println("Tu número es impar");
        }

    }

}
