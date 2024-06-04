package Java.w3resources.Basics1;

//28. Write a Java program to convert a hexadecimal value into a decimal number.
//        Input Data:
//        Input a hexadecimal number: 25
//        Expected Output
//
//        Equivalent decimal number is: 37

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Reto28 {

    public static void main(String[] args) {

        String num_hex;
        int num_dec;
        Scanner sc=new Scanner(System.in);
        num_hex=sc.nextLine();

        num_dec=Integer.parseInt(num_hex,16);
        System.out.println("El número hexadecimal "+ num_hex + " se escribe en decimal como:" + num_dec);
    }
}
