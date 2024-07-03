package Java.w3resources.Basics1;

import java.util.Scanner;

//64. Write a Java program that accepts two integer values between 25 and 75 and returns true if there is a common digit in both numbers.
//        Sample Output:
//
//        Input the first number : 35
//        Input the second number: 45
//        Result: true
public class Reto64 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        Integer a = sc.nextInt();
        System.out.println("Introduce el segundo número");
        Integer b = sc.nextInt();

        int long_a=Integer.toString(a).length();
        int long_b=Integer.toString(b).length();

        String resultado="¡No!";

        if(24<a&&a<76&&24<b&&b<76){

            for (int i=0;i<long_a;i++){
                for (int j=0;j<long_b;j++){
                if(a.toString().charAt(i)==b.toString().charAt(j)){
                    resultado="¡Sí!";
                }
                }
            }
            System.out.println("¿Se cumplen las condiciones? "+resultado);
        }else{
            System.out.println("Números fuera de rango");
        }
    }
}
