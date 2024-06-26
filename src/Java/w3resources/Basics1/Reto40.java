package Java.w3resources.Basics1;

import java.nio.charset.Charset;

//40. Write a Java program to list the available character sets in charset objects.
//        Expected Output
//
//        List of available character sets:
//        Big5
//        Big5-HKSCS
//        CESU-8
//        EUC-JP
//        EUC-KR
//        GB18030
//        GB2312
//        GBK
//
//        ...
//
//        x-SJIS_0213
//        x-UTF-16LE-BOM
//        X-UTF-32BE-BOM
//        X-UTF-32LE-BOM
//        x-windows-50220
//        x-windows-50221
//        x-windows-874
//        x-windows-949
//        x-windows-950
//        x-windows-iso2022jp
public class Reto40 {

    public static void main(String[] args) {
        System.out.println("List of available character sets: ");

        // Iterate through the available character sets and print their names
        for (String str : Charset.availableCharsets().keySet()) {
            System.out.println(str);
        }
    }
}


