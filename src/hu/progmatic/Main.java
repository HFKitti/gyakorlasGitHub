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


       /* int count = 0;
        int  number = 30;
        for (int i= 1; i <= number ; i++){
            if ( number % i == 0){
                count++;
            }


        }
        System.out.println("Osztok száma : " + count);*/

        int count = 0;
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
        }

    }
}