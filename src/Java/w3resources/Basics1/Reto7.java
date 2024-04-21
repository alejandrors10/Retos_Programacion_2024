package Java.w3resources.Basics1;
import java.util.Scanner;

/*7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        Test Data:
        Input a number: 8
        Expected Output :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24
        ...
        8 x 10 = 80*/

public class Reto7 {
        public static void main(String[] args) {
            // Creamos el escáner
            Scanner input = new Scanner(System.in);

            System.out.print("introduce el número mágico : ");
            int num1 = input.nextInt();

            for(int i=1; i<11; i++){
                int resultado=num1*i;
                System.out.println("8 x "+i+ " = "+resultado);
            }

        }
}

