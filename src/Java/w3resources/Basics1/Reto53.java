package Java.w3resources.Basics1;

import java.util.Scanner;

//53. Write a Java program that accepts three integers from the user.
// It returns true if the second number is higher than the first number and the third number is larger than the second number.
// If "abc" is true, the second number does not need to be larger than the first number.
//        Sample Output:
//
//        Input the first number : 5
//        Input the second number: 10
//        Input the third number : 15
//        The result is: true
public class Reto53 {

    public static void main(String[] args) {

        Scanner sc=new Scanner((System.in));
        boolean resultado=false;

        System.out.println("Introduce el primer número");
        int a=sc.nextInt();
        System.out.println("Introduce el segundo número");
        int b=sc.nextInt();
        System.out.println("Introduce el tercer número");
        int c=sc.nextInt();
        System.out.println("Introduce abc: true o false");
        boolean abc=sc.nextBoolean();

        if(!abc&&b>a&&c>b){
            resultado=true;
        } else if (abc&&c>b) {
            resultado=true;
        }else{
            resultado=false;
        }

        System.out.println("\n"+resultado);
    }

}
