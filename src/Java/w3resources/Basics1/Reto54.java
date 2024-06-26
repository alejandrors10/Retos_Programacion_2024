package Java.w3resources.Basics1;

import java.util.Scanner;

//54. Write a Java program that accepts three integers from the user and returns true if two or more of them (integers) have the same rightmost digit. The integers are non-negative.
//        Sample Output:
//
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true
public class Reto54 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int a=sc.nextInt();
        System.out.println("Introduce el segundo número");
        int b=sc.nextInt();
        System.out.println("Introduce el tercer número");
        int c=sc.nextInt();

        boolean resultado=false;

        if(a>0&&b>0&&c>0){
            if (a%10==b%10||a%10==c%10||b%10==c%10){
                resultado=true;
            }
        }
        System.out.println("Todos los números son positivos y al menos algunas de las unidades coinciden: "+resultado);
    }

}
