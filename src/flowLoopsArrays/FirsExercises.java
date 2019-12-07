package flowLoopsArrays;

import java.util.Scanner;

public class FirsExercises {
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        System.out.println("Iveskite skaicu");
        double a = textScanner.nextDouble();
        if (a > 30) {
            System.out.println("Jusu skaicius yra didesnis uz 30");
        } else if (a == 30) {
            System.out.println("Jusu skaicius yra lygus 30");
        } else
            System.out.println("Jusu skaicius yra mazesnis uz 30");
    }
}
