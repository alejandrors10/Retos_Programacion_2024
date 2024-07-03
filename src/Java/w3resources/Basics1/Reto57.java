package Java.w3resources.Basics1;

import java.util.Scanner;

//57. Write a Java program to accept an integer and count the factors of the number.
//        Sample Output:
//
//        Input an integer: 25
//        3
public class Reto57 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el rango");
        int num = sc.nextInt();

        int contador=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                contador++;
                i=2;
            }
        }
        System.out.println("Número de factores primos: "+contador);

    }
}
