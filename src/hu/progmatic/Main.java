package hu.progmatic;

public class Main {

    public static void main(String[] args) {

       /* int year = 1999;
        if (year > 1582) {
            if (year % 4 == 0 && year % 400 == 0) {
                System.out.println("Szökőév");
            } else if (year % 100 == 0){
                System.out.println("Nem szökőév");
            } else if (year % 4 == 0) {
                System.out.println("Szökőév");
            } else {
                System.out.println("Nem szökőév");
            }
        }   else {
            System.out.println("Nem szökőév");
        }*/


        /*int count = 0;
        int  number = Integer.MAX_VALUE;
        for (int i= 0; i < number ; i++){
            if ( number % (i+1)  == 0){
                count++;
            }


        }
        System.out.println("Osztok száma : " + count);*/

        /*int count = 0;
        int  number = 2147483647;
        for (long i = 1; i <= number ; i++){
            if ( number % i == 0){
                count++;
            }

        }

        if (count == 2) {
            System.out.println("Prím");
        } else {
            System.out.println("Nem prím");
        }*/

        /*int n1 = 5432;
        int n2 = 2345;
        int common = 0;

        for (int i = 1; i<= n2 || i<= n1; i++){
            if ( n1 % i == 0 && n2 % i == 0) {
                common = i;
            }

        }
        System.out.println("A legnagyobb közös osztó:" + common);*/
    }
}