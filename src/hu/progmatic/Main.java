package hu.progmatic;

public class Main {

    public static void main(String[] args) {

        int year = 1999;
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
        }

    }
}
