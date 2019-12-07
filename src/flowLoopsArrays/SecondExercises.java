package flowLoopsArrays;

import java.util.Scanner;

public class SecondExercises {
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        System.out.println("Iveskite pirma skaicu");
        double a = textScanner.nextDouble();
        System.out.println("Iveskite antra skaicu");
        double b = textScanner.nextDouble();
        if (a > 30) {

            if (b > 30) {
                System.out.println("Jusu abu skaiciai yra didesni uz 30");
            } else if (b == 30) {
                System.out.println("Pirmas skaicius yra didesnis uz 30; antras lygus 30");
            } else System.out.println("Pirmas skaicius yra didesnis uz 30; antras maziau uz 30");

        } else if (a == 30) {

            if (b > 30) {
                System.out.println("Pirmas skaicius yra lygus 30; antras daugiau uz 30");
            } else if (b == 30) {
                System.out.println("abu skaiciai yra lygus 30");
            } else System.out.println("Pirmas skaicius yra lygus 30; antras maziau uz 30");

        } else if (a < 30) {

            if (b > 30) {
                System.out.println("Pirmas skaicius yra mazesnis uz 30; antras didesnis uz 30");
            } else if (b == 30) {
                System.out.println("Pirmas skaicius yra mazesnis uz 30; antras lygus 30");
            } else System.out.println("abu skaiciai yra maziau uz 30");

        }
    }
}

