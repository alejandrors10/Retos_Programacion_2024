package Java.w3resources.Basics1;

public class Reto19 {

    public static void main(String[] args) {

        int i=0;
        int a=1;

        long x=11011101101L;
        long y=10L;

        int []sum=new int[20];

        while (x>1) {
            System.out.println(x / y);
            x=x/10;
        }
      /*  while (i<20) {

            sum[i]=++a;
            System.out.println(sum[i++]);
//            ++i;
//            ++a;
        }*/
    }
}
