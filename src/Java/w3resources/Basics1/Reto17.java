package Java.w3resources.Basics1;

import java.util.Scanner;

/*Write a Java program to add two binary numbers.
        Input Data:
        Input first binary number: 10
        Input second binary number: 11
        Expected Output

        Sum of two binary numbers: 101*/
public class Reto17 {
        public static void main(String[] args) {

            int binary1, binary2;
            int i = 0, remainder = 0;
            int[] sum = new int[20];

            Scanner in = new Scanner(System.in);

            System.out.print("Introduce el primer binario: ");
            binary1 = in.nextInt();
            System.out.print("Introduce el segundo binario: ");
            binary2 = in.nextInt();

            while (binary1 != 0 || binary2 != 0) {
                sum[i++] = ((binary1 % 10 + binary2 % 10 + remainder) % 2); // Se añade al array la suma de las unidades más el remainder. Si la suma es 0=0, si 1=1, si 2=0, si 3=1. Además, el índice del array aumenta en 1 cada vuelta
                remainder = ((binary1 % 10 + binary2 % 10 + remainder) / 2); //Aquí se calcula el remainder. Si es 0=0,si 1=0,si 2=1,si 3=1
                binary1 = binary1 / 10; //Se elimina el último dígito
                binary2 = binary2 / 10; //Se elimina el último dígito
            }

            // Si queda un remanente, añadirlo al final
            if (remainder != 0) {
                sum[i] = remainder;
            }

            // Recorremos el array a la inversa para crear
            System.out.print("Suma de los dos binarios: ");
            while (i >= 0) {
                System.out.print(sum[i--]);
            }
            System.out.print("\n");
        }
    }

