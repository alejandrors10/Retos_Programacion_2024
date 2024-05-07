package Java.w3resources.Basics1;

//19. Write a Java program to convert an integer number to a binary number.
//        Input Data:
//        Input a Decimal Number : 5
//        Expected Output
//
//        Binary number is: 101

import java.util.Scanner;

public class Reto19 {

    public static void main(String[] args) {


        //Instanciamos valores binarios, número resultado, número a transformar
        int[] b = {256,128,64, 32, 16, 8, 4, 2, 1};
        Integer resultado[] = new Integer [9];

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número entero: ");
        int numor = sc.nextInt();
        int num = numor;
        int cont=0;

        for (int i = 0; i < 9; i++) {
            if (num >= b[i]) {
                resultado[i] = 1;
                num = num - b[i];
                cont++;
            } else if (cont < 1) {
                resultado[i] = null;
            } else {
                resultado[i] = 0;
            }
        }

            System.out.print("El número " + numor + " se traduce en binario como: ");
            for (Integer n : resultado) {
                if (n != null) {
                    System.out.print(n);
                }
            }
        }
    }




