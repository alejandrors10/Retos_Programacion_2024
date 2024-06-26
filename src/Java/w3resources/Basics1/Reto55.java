package Java.w3resources.Basics1;

import java.time.LocalTime;
import java.util.Scanner;

//55. Write a Java program to convert seconds to hours, minutes and seconds.
//        Sample Output:
//
//        Input seconds: 86399
//        23:59:59
public class Reto55 {

    public static void main(String[] args) {

        Scanner sc=new Scanner((System.in));
       int segundos=sc.nextInt();
        System.out.println(LocalTime.ofSecondOfDay(segundos));

    }
}
