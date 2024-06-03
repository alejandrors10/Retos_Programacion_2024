package Java.w3resources.Basics1;

//25. Write a Java program to convert a octal number to a decimal number.
//        Input Data:
//        Input any octal number: 10
//        Expected Output
//
//        Equivalent decimal number: 8

import java.util.Scanner;

public class Reto25 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Introduce el número octal: ");
        Integer num_oct=sc.nextInt();

        int num_oct_or=num_oct;
        int res_dec=0;
        int longitud=num_oct.toString().length();

        //Hacemos un bucle de tantas vueltas como dígitos el número octal a transformar.
        //Cada vuelta, el exponente de las unidades aumenta en 1, se multiplica por el valor de las unidades y se suma al resultado.
        for (int i=0;i<longitud;i++){
            int unidad=num_oct%10;
            res_dec=res_dec+(int)Math.pow(8,i)*unidad;
            num_oct=num_oct/10;
        }

        System.out.println("El número octal '"+num_oct_or+ "' en decimal es: " + res_dec);
    }

    }



