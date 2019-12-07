package basic;

import java.util.Scanner;

public class ThirdExercises {
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);

        System.out.println("Iveskite pirma skaiciu ");
        int a = textScanner.nextInt();
        System.out.println("Iveskite antra skaiciu ");
        int b = textScanner.nextInt();

        System.out.printf("Jusu skaiciu dalmuo yra suapvalintas iki 3 skaiciu po kablelio %.3f", (double) a / b);
    }
}
