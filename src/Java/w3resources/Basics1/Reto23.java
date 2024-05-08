package Java.w3resources.Basics1;

// Write a Java program to convert a binary number to a hexadecimal number.
//         Input Data:
//         Input a Binary Number: 1101
//         Expected Output
//
//         HexaDecimal value: D

import java.util.Scanner;

public class Reto23 {

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

        int resto, num_dec, num_dec_or;
        String num_hex="";
        char [] codigo_hex={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        num_dec=resultado_dec;

        while(num_dec>0){
            resto=num_dec%16;
            num_hex=codigo_hex[resto]+num_hex;
            num_dec=num_dec/16;
        }

        System.out.println("El número binario"+num_bin_or+ " en hexadecimal es: " + num_hex);
    }
}
