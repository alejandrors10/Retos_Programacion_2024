package Java.w3resources.Basics1;

import java.util.Scanner;

//42. Write a Java program to input and display your password.
//        Expected Output
//
//        Input your Password:
//        Your password was: abc@123
public class Reto42 {

    private String contraseña;

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public static void main(String[] args) {

        Reto42 ejemplo=new Reto42();
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu contraseña: ");
        ejemplo.setContraseña(sc.nextLine());
        System.out.println("¡Contraseña guardada con éxito!\n\n¿Qué quieres hacer ahora? Salir(1) / Mostrar contraseña(2)");
        int accion=sc.nextInt();

        if (accion==2) {

            try {
                // Display the password to the console.
                System.out.println("Tu contraseña es: "+ejemplo.getContraseña());
            } finally {
                // Ensure that the password array is securely cleared.
                if (ejemplo.getContraseña() != null) {
                   ejemplo.setContraseña(null);
                }
            }
        }
    }
}

