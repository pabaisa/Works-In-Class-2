package objectOrentedPrograming;

import java.util.Scanner;

public class GroceryShopping {

    public static void main(String[] args) {
        Scanner inputProduct = new Scanner(System.in);
        Scanner inputProductPrice = new Scanner(System.in);
        Products[] productsList = new Products[5];
        int index = 0;
        do {
            System.out.println("Iveskite prekes pavadinima: ");
            String name = inputProduct.nextLine();

            System.out.println("Iveskite prekes kaina: ");
            double price = inputProductPrice.nextDouble();

            productsList[index] = new Products(name, price);
            index++;
        }
        while (index < 3);
        double sum = priceOfAllProducts(productsList);
        System.out.println("kaina uz visus produktus - " + sum);

    }

    private static double priceOfAllProducts(Products[] productsList) {
        double sumOfAll = 0;
        for (int a = 0; a < 3; a++) {
            sumOfAll = sumOfAll + productsList[a].getPrice();
        }
        return sumOfAll;
    }
}

