package basic;

import java.util.Scanner;

public class SecondExercizes {
    public static void main(String[] args){
       Scanner textScanner = new Scanner(System.in);

        System.out.println("Iveskite skaiciu ");
        double a = textScanner.nextDouble();
        System.out.printf("%.2f" , a);
    }
}
