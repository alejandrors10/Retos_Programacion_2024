package Java.w3resources.Basics1;

import java.util.Scanner;

//Write a Java program to convert a decimal number to a hexadecimal number.
//        Input Data:
//        Input a decimal number: 15
//        Expected Output
//
//        Hexadecimal number is : F
public class Reto20 {

    public static void main(String[] args) {

    int resto, num_dec, num_dec_or;
    String num_hex="";
    char [] codigo_hex={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

    Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el número decimal");
        num_dec=sc.nextInt();
        num_dec_or=num_dec;
        while(num_dec>0){
            resto=num_dec%16;
            num_hex=codigo_hex[resto]+num_hex;
            num_dec=num_dec/16;
        }

        System.out.println("El número "+num_dec_or+ " en hexadecimal se escribe " + num_hex);
    }
}
