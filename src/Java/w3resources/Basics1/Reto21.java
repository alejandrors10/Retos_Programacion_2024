package Java.w3resources.Basics1;

//Write a Java program to convert a decimal number to an octal number.
//        Input Data:
//        Input a Decimal Number: 15
//        Expected Output
//
//        Octal number is: 17

import java.util.Scanner;

public class Reto21 {

    public static void main(String[] args) {

        int resto, num_dec, num_dec_or;
        String num_oct="";
        char [] codigo_oct={'0','1','2','3','4','5','6','7'};

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el número decimal");
        num_dec=sc.nextInt();
        num_dec_or=num_dec;

        while(num_dec>0){
            resto=num_dec%8;
            num_oct=codigo_oct[resto]+num_oct;
            num_dec=num_dec/8;
        }

        System.out.println("El número "+num_dec_or+ " en octal se escribe " + num_oct);
    }
}

