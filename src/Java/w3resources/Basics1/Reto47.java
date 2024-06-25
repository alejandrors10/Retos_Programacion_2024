package Java.w3resources.Basics1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


//47. Write a Java program to display the current date and time in a specific format.
//        Sample Output:
//
//        Now: 2017/06/16 08:52:03.066




public class Reto47 {

    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm");
        String text = date.format(formatter);

        System.out.println(text);
    }
}
