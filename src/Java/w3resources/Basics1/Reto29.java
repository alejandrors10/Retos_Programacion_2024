package Java.w3resources.Basics1;

import java.util.Scanner;

public class Reto29 {

    public static int hex_to_decimal(String s) {
        // Define a string containing hexadecimal digits
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase(); // Convert the input string to uppercase
        int val = 0; // Initialize the decimal value to 0

        // Iterate through each character in the input string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Get the current character
            int d = digits.indexOf(c); // Find the index of the character in the digits string
            val = 16 * val + d; // Update the decimal value using hexadecimal conversion
        }

        return val; // Return the decimal value
    }
    public static long dec_to_bin(int num_dec) {
        int i=0;
        long num_bin=0;
        int coc = num_dec;
        while (coc != 0) {
            num_bin = (long) ((coc % 2)*Math.pow(10,i))+num_bin;
            coc = coc / 2;
            i++;
        }

        return num_bin;

    }

    public static void main(String[] args) {
        String num_hex;
        long num_bin;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu número hexagonal: ");
        num_hex=sc.nextLine();

        num_bin=dec_to_bin(hex_to_decimal(num_hex));
        System.out.println("El número hexadecimal "+ num_hex + " se escribe en decimal como:" + num_bin);

    }
}
