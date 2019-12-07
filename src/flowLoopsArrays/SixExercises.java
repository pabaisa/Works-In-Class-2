package flowLoopsArrays;

import java.util.Scanner;

public class SixExercises {
    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        System.out.println("Ka noresite prikti? Piena ar Vyna? prasome parasyti");
        if (textScanner.next().equals("piena")) {
            System.out.println("Pieno kaina - 1.90 EUR, Prasome parsyti jusu duodamu pinigu suma");
            double price = textScanner.nextDouble();
            if (price== 1.90) {
                System.out.println("aciu, kad pirkote!");
            } else if (price < 1.90) {
                System.out.println("truksta iki 1.90 EUR");
            } else if (price > 1.90) {
                System.out.println("jusu graza! Aciu uz pirkima");
            }
        }
    }

}

