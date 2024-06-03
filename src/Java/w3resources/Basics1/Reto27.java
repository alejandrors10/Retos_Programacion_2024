package Java.w3resources.Basics1;

import java.util.Scanner;

//27. Write a Java program to convert a octal number to a hexadecimal number.
//        Input Data:
//        Input a octal number : 100
//        Expected Output
public class Reto27 {

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

        int resto, num_dec;
        String num_hex="";
        char [] codigo_hex={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};


        num_dec=res_dec;

        while(num_dec>0){
            resto=num_dec%16;
            num_hex=codigo_hex[resto]+num_hex;
            num_dec=num_dec/16;
        }

        System.out.println("El número "+num_oct_or+ " en hexadecimal se escribe " + num_hex);
    }
}

