package objectOrentedPrograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GroceryShopping {
    private static List<Products> productsList = new ArrayList<>();


    public static void main(String[] args) {
        for (int x = 0; x <= 5; x++) {
            Random randomPrice = new Random();
            Random randomProduct = new Random();

            Products products = new Products("Preke" + randomProduct.nextInt(2), randomPrice.nextInt(2));
            GroceryShopping.productsList.add(products);
            System.out.println(products.getName());
            System.out.println(products.getPrice());
        }

    }
}
