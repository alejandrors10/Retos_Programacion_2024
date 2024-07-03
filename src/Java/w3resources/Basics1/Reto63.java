package Java.w3resources.Basics1;

import java.util.Arrays;
import java.util.Scanner;

//63. Write a Java program that accepts two integer values from the user and returns the largest value. However if the two values are the same, return 0 and find the smallest value if the two values have the same remainder when divided by 6.
//        Sample Output:
//
//        Input the first number : 12
//        Input the second number: 13
//        Result: 13
public class Reto63 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[2];

        System.out.println("Introduce el primer número");
        array[0] = sc.nextInt();
        System.out.println("Introduce el segundo número");
        array[1] = sc.nextInt();

        Arrays.sort(array);

        if (array[0] == array[1]) {
            System.out.println(0);
        }else if (array[0] % 6 == array[1] % 6) {
            System.out.println("El menor valor es: " + array[0]);
        }else{
            System.out.println("El mayor valor es: " + array[array.length - 1]);
        }
        }
    }

