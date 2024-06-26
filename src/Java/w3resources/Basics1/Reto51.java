package Java.w3resources.Basics1;

import java.util.Scanner;

//51. Write a Java program to convert a string to an integer.
//        Sample Output:
//
//        Input a number(string): 25
//        The integer value is: 25
public class Reto51 {

    public static void main(String[] args) {

        Scanner sc=new Scanner((System.in));

        System.out.println("Introduce el número(String)");
        String txt=sc.next();
        int num=Integer.parseInt(txt);
        System.out.println(num);
    }


}
