package objectOrentedPrograming.Station;

import java.util.Scanner;

public class PetrolStationMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputLitres = new Scanner(System.in);
        Scanner inputPrice = new Scanner(System.in);
        Gas[] gas = new Gas[100];
        int index = 0;

        boolean repeat = true;
        do {

            System.out.println("iveskite degalu kieki");
            int litres = inputLitres.nextInt();
            System.out.println("iveskite degalu kaina");
            int price = inputPrice.nextInt();

            gas[index] = new Gas(litres, price);
            index++;

            System.out.println("ar norite testi? 'Yes' - 'No'");
            String a = input.nextLine();
            if (a.equals("Yes")) {
                repeat = true;

            } else if (a.equals("No")) {
                repeat = false;

                System.out.println("parasykite jusu numatoma mekejimo suma");
                double guessPrice = input.nextDouble();

                if (guessPrice < sumOfAllGas(gas)) {
                    double balance = sumOfAllGas(gas) - guessPrice;
                    System.out.println("Jums dar reikia sumoketi " + balance);
                } else if (guessPrice == sumOfAllGas(gas)) {
                    System.out.println("Teisinga suma!");
                } else if (guessPrice > sumOfAllGas(gas)) {
                    double balance = guessPrice - sumOfAllGas(gas);
                    System.out.println("Jums dar reikia sumoketi" + balance);
                }
            }
        }
        while (repeat);
    }

    private static double sumOfAllGas(Gas[] gas) {
        double priceOfGas = 0;

        for (int a = 0; a < gas.length; a++) {
            if (gas[a] != null) {
                priceOfGas = priceOfGas + gas[a].getLitres() * gas[a].getPrice();
            } else
                break;
        }
        return priceOfGas;
    }
}
