package Reto_3;

import java.util.Random;

public class AlejandroRS10 {
        public static void main(String[] args) {
            Random random = new Random();

            int minCifras = 8;
            int maxCifras = 16;

            int cifras = random.nextInt(maxCifras - minCifras + 1) + minCifras;

            long randomNumber = generateRandomNumber(cifras);

            System.out.println("Número aleatorio con " + cifras + " cifras: " + randomNumber);
        }

        public static long generateRandomNumber(int cifras) {
            Random random = new Random();
            StringBuilder numberStr = new StringBuilder();

            for (int i = 0; i < cifras; i++) {
                int digit = random.nextInt(10); // Genera un dígito aleatorio entre 0 y 9
                numberStr.append(digit);
            }

            return Long.parseLong(numberStr.toString());
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