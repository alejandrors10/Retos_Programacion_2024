package Java.w3resources.Basics1;

import java.io.File;

//45. Write a Java program to find the size of a specified file.
//        Sample Output:
//
//        /home/students/abc.txt  : 0 bytes
//        /home/students/test.txt : 0 bytes
public class Reto45 {

    public static void main(String[] args) {

        System.out.println("/ejercicios/básicos1/abc.txt"+new File("abc.txt").length());
        System.out.println("/ejercicios/básicos1/test.txt"+new File("test.txt").length());

    }

}
