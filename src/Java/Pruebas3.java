package Java;

import java.util.Random;

public class Pruebas3 {

    public static void main(String[] args) {

        generateRandomNumber(12);
    }
    public static int generateRandomNumber(int cifras) {

        Random random=new Random();
        StringBuilder numberStr = new StringBuilder();

        for (int i = 0; i < cifras; i++) {
            int digit = random.nextInt(10); // Genera un dígito aleatorio entre 0 y 9
            numberStr.append(digit);
        }

        return Integer.parseInt(numberStr.toString());
    }
}
