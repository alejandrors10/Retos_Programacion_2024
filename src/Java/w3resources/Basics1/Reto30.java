package Java.w3resources.Basics1;

import java.util.Scanner;

import static Java.w3resources.Basics1.Reto29.hex_to_decimal;

//30. Write a Java program to convert a hexadecimal value into an octal number.
//        Input Data:
//        Input a hexadecimal number: 40
//        Expected Output
//
//        Equivalent of octal number is: 100
public class Reto30 {

    public static String dec_to_oct(int decimal){
        int resto=0;
        String num_oct="";
        char [] codigo_oct={'0','1','2','3','4','5','6','7'};

        while(decimal>0){
            resto=decimal%8;
            num_oct=codigo_oct[resto]+num_oct;
            decimal=decimal/8;
        }
        return num_oct;
    }


    public static void main(String[] args) {
        String num_hex;
        String num_oct;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu número hexagonal: ");
        num_hex=sc.nextLine();

        num_oct=dec_to_oct(hex_to_decimal(num_hex));
        System.out.println("El número hexadecimal "+ num_hex + " se escribe en octal como:" + num_oct);

    }
}
