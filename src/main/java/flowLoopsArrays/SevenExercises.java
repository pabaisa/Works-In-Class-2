package flowLoopsArrays;

import java.util.Scanner;

public class SevenExercises {
    public static void main(String[] args) {
        boolean programWorks = true;
        Scanner textScanner = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        double a = textScanner.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double b = textScanner.nextDouble();
        double x = a / b;
        System.out.printf("skaiciu dalmuo yra %.4f", x);
        System.out.println();
        do {
            System.out.println("Iveskite dar viena skaiciu");
            double b2 = textScanner.nextDouble();
            if (b2 == 0 || x == 0) {
                break;
            }
            System.out.printf("naujas dalmou yra %.4f", x / b2);
        }
        while (programWorks);
    }
}
