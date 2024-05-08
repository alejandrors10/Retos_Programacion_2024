package Java.w3resources.Basics1;

//22. Write a Java program to convert a binary number to a decimal number.
//        Input Data:
//        Input a binary number: 100
//        Expected Output
//
//        Decimal Number: 4

import java.util.Scanner;

public class Reto22 {

    public static void main(String[] args) {


        Long num_bin;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número binario");
        num_bin = sc.nextLong();
        long num_bin_or=num_bin;
        int longitud=num_bin.toString().length();
        long resultado=0;

        for (int i=0;i<longitud;i++){
            if(num_bin%10==1){
                resultado=resultado+(long)Math.pow(2,i);
            }
            num_bin=num_bin/10;
        }

        System.out.println("El número binario '"+num_bin_or+"' en decimal es: "+resultado);
    }
}
