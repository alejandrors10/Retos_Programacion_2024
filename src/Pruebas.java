import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.util.Random;

public class Pruebas {
    public static void main(String[] args) {



    }

    public static int generateRandomLenght(){
        Random random = new Random();

        int minCifras = 8;
        int maxCifras = 16;

        int cifras = random.nextInt(maxCifras - minCifras + 1) + minCifras;

        return cifras;
    }

    public static int generateRandomNumber(int cifras) {
        Random random = new Random();
        StringBuilder numberStr = new StringBuilder();

        for (int i = 0; i < cifras; i++) {
            int digit = random.nextInt(10); // Genera un dígito aleatorio entre 0 y 9
            numberStr.append(digit);
        }

        return Integer.parseInt(numberStr.toString());
    }

    public static char generateRandomLetter() {
        Random random = new Random();
        char letter = (char) (random.nextInt(26) + 'a');
        return letter;
    }

    public static String generateRandomPassword(int length) {
        String symbols = "!@#$%^&*()_-+=[]{}|;:,.<>?";
        Random random = new Random();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(symbols.length());
            char symbol = symbols.charAt(index);
            password.append(symbol);
        }

        return password.toString();
    }
}




/*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */