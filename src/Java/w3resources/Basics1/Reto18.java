package Java.w3resources.Basics1;


//18. Write a Java program to multiply two binary numbers.
//        Input Data:
//        Input the first binary number: 10
//        Input the second binary number: 11
//        Expected Output
//
//        Product of two binary numbers: 110
public class Reto18 {

    public static int multiplicar (int )
    public static int sumar(int primero, int segundo) {

        int binary1=primero;
        int binary2=segundo;
        int i = 0;
        int remainder = 0;
        int[] sum = new int[20];

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

        StringBuilder sb = new StringBuilder(); // Utilizamos StringBuilder para construir el número en orden inverso

        // Concatenar cada dígito en orden inverso al StringBuilder
        for (int j = sum.length - 1; j >= 0; j--) {
            sb.append(sum[j]);
        }

        // Convertir el StringBuilder a un número entero

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {

    System.out.println(sumar(101,110));


}


}
