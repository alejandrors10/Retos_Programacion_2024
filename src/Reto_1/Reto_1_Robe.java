package Reto_1;

import java.util.Scanner;

public class Reto_1_Robe {
    public static final String codigoleet = "4 8 [ ? € /= & # 1 ] |< £ |V| И И~ Ø 9 0_ Я 5 7 µ v uu >< ¥ 2";
        public static void main (String[]args){
            // Create Scanner
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe texto para hackear:");
            String texto = sc.nextLine();
            String[] leet = codigoleet.split(" ");
            String[] texto_v = texto.split(" ");
            String[] texto_final = new String[texto_v.length];

            // Declaración del array de caracteres para el abecedario en minúsculas
            char[] abecedarioMinusculas = new char[26];

            // Llenar el array con las letras del abecedario en minúsculas
            for (char letra = 'a'; letra <= 'z'; letra++) {
                int indice = letra - 'a'; // Calcular el índice correspondiente para cada letra
                abecedarioMinusculas[indice] = letra;
            }
            //Aquí tengo que conseguir convertir el texto en idioma leet
            for (int i=0;i<texto.length();i++){
                if(texto_v[i].equals(" ") != true){
                    for(int j = 0; j <abecedarioMinusculas.length; j++){
                        if(texto_v[i].equals(abecedarioMinusculas[j])){
                            texto_final[i] = leet[j];
                        }
                    }
                }
            }

            System.out.println(texto_final);

            sc.close();
        }
    }


/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/)
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */