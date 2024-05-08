package Java.w3resources.Basics1;

//Write a Java program to convert a binary number to an octal number.
//        Input Data:
//        Input a Binary Number: 111
//        Expected Output
//
//        Octal number: 7

import java.util.Scanner;

public class Reto24 {

    public static void main(String[] args) {


        Long num_bin;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número binario");
        num_bin = sc.nextLong();

        long num_bin_or=num_bin;
        int longitud=num_bin.toString().length();
        int resultado_dec=0;

        for (int i=0;i<longitud;i++){
            if(num_bin%10==1){
                resultado_dec=resultado_dec+(int)Math.pow(2,i);
            }
            num_bin=num_bin/10;
        }

        String num_oct="";
        char [] codigo_oct={'0','1','2','3','4','5','6','7'};
        int resto=0;
        long num_dec=resultado_dec;

        while(num_dec>0){
            resto=(int)num_dec%8;
            num_oct=codigo_oct[resto]+num_oct;
            num_dec=num_dec/8;
        }

        System.out.println("El número binario '"+resultado_dec+ "' en octal se escribe: " + num_oct);

    }

}
