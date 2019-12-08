package flowLoopsArrays;

import java.util.Scanner;

public class ForExercises {
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        System.out.println("iveskite skaiciu nuo 0 iki 9");
        int a = textScanner.nextInt();

        switch (a) {
            case 0:
                System.out.println("nulis");
                break;
            case 1:
                System.out.println("vienas");
                break;
            case 2:
                System.out.println("du");
                break;
            case 3:
                System.out.println("trys");
                break;
            case 4:
                System.out.println("keturi");
                break;
            case 5:
                System.out.println("penki");
                break;
            case 6:
                System.out.println("sesi");
                break;
            case 7:
                System.out.println("septyni");
                break;
            case 8:
                System.out.println("astuoni");
                break;
            case 9:
                System.out.println("devyni");
                break;
        }
    }
}
