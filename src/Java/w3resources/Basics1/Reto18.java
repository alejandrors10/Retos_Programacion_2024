package Java.w3resources.Basics1;


import java.util.Scanner;

//18. Write a Java program to multiply two binary numbers.
//        Input Data:
//        Input the first binary number: 10
//        Input the second binary number: 11
//        Expected Output
//
//        Product of two binary numbers: 110
public class Reto18 {

    public static long multiplicar (long primero, long segundo){

        Long longitud=segundo;
        String l=longitud.toString();
        long sumandos[]=new long[l.length()];
        int i=0;
        int salto=1;
        long factor2=segundo;
        long resultado=0L;

        //Multiplicamos el factor1 por las unidades del factor2, el sumando se guarda en un array.
        // Pasamos a las décimas eliminando las unidades del factor2 y multiplicando cada siguiente sumando por 10^i
        while(factor2>0) {
            sumandos[i] = primero * (factor2 % 10)* salto;
            factor2 = factor2 / 10;
            i++;
            salto=salto*10;
        }

        //Recorremos el array sumando cada sumando con el siguiente,
        // usando el método del ejercicio anterior, al que modificamos
        // ligeramente para devolver long funcionales en vez de Strings
        for (int j=0;j<sumandos.length;j++) {
            resultado=Reto18.sumar(resultado,sumandos[j]);
        }

        return resultado;
    }
    public static long sumar(long primero, long segundo) {

        long binary1=primero;
        long binary2=segundo;
        int i = 0;
        long remainder = 0;
        long[] sum = new long[20];

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

        // Utilizamos StringBuilder para construir el número en orden inverso
        StringBuilder sb = new StringBuilder();

        // Concatenar cada dígito en orden inverso al StringBuilder
        for (int j = sum.length - 1; j >= 0; j--) {
            sb.append(sum[j]);
        }

        // Convertir el StringBuilder a long

        return Long.parseLong(sb.toString());
    }

    public static void main(String[] args) {

        // Creamos escáner y entrada de datos
        Scanner in=new Scanner(System.in);
        System.out.println("Introduce el primer factor: ");
        int primero=in.nextInt();
        System.out.println("Introduce el segundo factor: ");
        int segundo=in.nextInt();

        System.out.println("El resultado es: " + multiplicar(primero,segundo));

    }

}
