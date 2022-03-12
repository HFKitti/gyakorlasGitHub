package hu.progmatic;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

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
     /*Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy számot!");
        int szam1 = scanner.nextInt();
        System.out.println("Kérek még egy számot!");
        int szam2 = scanner.nextInt();

       if (szam2 == 0 ){
           System.out.println(" Nullával nem osztunk!");
       }else{
           System.out.println(szam1/szam2);
        }*/


       /* int number =-10;
        if (number > 0){
            System.out.println(number-1);;
        }else{
            System.out.println(number);
        }*/

        /*int number = -10;
        if (number <0){
            System.out.println("Negativ");
        }else if (number > 0){
            System.out.println("pozitiv");
        }else{
            System.out.println("nulla");
        }*/

      /*  String light1 = "Piros";
        if (light1.equals("zöld")){
            System.out.println("SZABAD");
        } else if (light1.equalsIgnoreCase("sárga")){
            System.out.println("LASSITS!");
        } else if (light1.equalsIgnoreCase("piros")){
            System.out.println("MEGÁLLJ!");
        }else{
            System.out.println("NEM TUDOM");
        }*/

       Scanner scanner = new Scanner(System.in);
       String light1 = scanner.nextLine();
        if (light1.equalsIgnoreCase("december")
                ||light1.equalsIgnoreCase("január")
                || light1.equalsIgnoreCase("február")) {
            System.out.println("TÉL");
        } else if (light1.equalsIgnoreCase("március")
                ||light1.equalsIgnoreCase("április")
                || light1.equalsIgnoreCase("május")) {
            System.out.println("TAVASZ");
        } else if (light1.equalsIgnoreCase("junius")
                ||light1.equalsIgnoreCase("julius")
                || light1.equalsIgnoreCase("augusztus")) {
            System.out.println("NYÁR");
        }else{
            System.out.println("ŐSZ");
        }



    }
}