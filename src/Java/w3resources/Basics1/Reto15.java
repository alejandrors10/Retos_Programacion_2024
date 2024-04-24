package Java.w3resources.Basics1;

/*
Write a Java program to swap two variables.
*/
public class Reto15 {

    public static void main(String[] args) {

        int a=1;
        int b=2;

        System.out.println("Valor a:"+ a + "   Valor b:"+ b);
        int cambio;
        cambio=a;
        a=b;
        b=cambio;
        System.out.println("\nProcesando cambio...\nValor a:"+ a + "   Valor b:"+ b);

    }
}
