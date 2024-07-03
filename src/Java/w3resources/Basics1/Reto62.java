package Java.w3resources.Basics1;

import java.util.Scanner;

//62. Write a Java program that accepts three integer values and returns true if one is 20 or more less than the others' subtractions.
//        Sample Output:
//
//        Input the first number : 15
//        Input the second number: 20
//        Input the third number : 25
//        false
public class Reto62 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int a=sc.nextInt();
        System.out.println("Introduce el segundo número");
        int b=sc.nextInt();
        System.out.println("Introduce el tercer número");
        int c=sc.nextInt();

        boolean resultado = false;

        if (a>=20&&Math.abs(b-c)>a||b>=20&&Math.abs(a-c)>b||c>=20&&Math.abs(b-a)>c){
            resultado=true;
        }
        System.out.println("¿Se cumple que algún valor sea igual o superior a 20 y que la diferencia de los otros dos sea mayor?: \n"+resultado);
    }
}
