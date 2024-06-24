package Java.w3resources.Basics1;

//39. Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
//        Expected Output
//
//        123
//        124
//        ...
//
//        431
//        432
//        Total number of the three-digit-number is 24
public class Reto39 {


    public static void main(String[] args) {

        int contador=0;

        for (int i=1;i<5;i++){
            for (int j=1;j<5;j++){
                for (int k=1;k<5;k++){
                    if(i!=j&&i!=k&&j!=k){
                        System.out.println(i+""+j+""+k);
                        contador++;
                    }

                }
            }
        }
        System.out.println("El número total de combinaciones es: "+contador);
    }

}
