package Java.w3resources.Basics1;

import java.util.Scanner;

public class Reto28_alt {

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

    public static void main(String[] args) {
        String num_hex;
        int num_dec;
        Scanner sc=new Scanner(System.in);
        num_hex=sc.nextLine();

        num_dec=hex_to_decimal(num_hex);
        System.out.println("El número hexadecimal "+ num_hex + " se escribe en decimal como:" + num_dec);

    }
}
