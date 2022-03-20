package ru.itmo.lessons.lessons6.products.product;

import java.util.Arrays;

public class MyProducts {
    private int maxProteins = 100;
    private int maxFats = 100;
    private int maxCarbohydrates = 100;
    private int maxCalories = 100;

    private Product[] productList = new Product[2];


    public MyProducts() {
    }

    public void addProduct(Product product) {

        if (product.getProteins() > maxProteins) {
            System.out.println("The amount of proteins exceeds the allowable rate in product: " + Product.nameOfProduct);
            return;
        }
        if (product.getFats() > maxFats) {
            System.out.println("The amount of fat exceeds the allowable rate in product: "+ Product.nameOfProduct);
            return;
        }
        if (product.getCarbohydrates() > maxCarbohydrates) {
            System.out.println("The amount of carbohydrates exceeds the allowable rate in product: "+ Product.nameOfProduct);
            return;
        }
        if (product.getCalories() > maxCalories) {
            System.out.println("The number of calories exceeds the allowable rate in product: "+ Product.nameOfProduct);
            return;
        }


        for (int i = 0; i < productList.length; i++) {
            productList[i] = product;
            return;
        }

        System.out.println("Product: " + Product.nameOfProduct + " is add to your list");
        return;
    }

    @Override
    public String toString() {
        return "MyProducts{" +
                "maxProteins=" + maxProteins +
                ", maxFats=" + maxFats +
                ", maxCarbohydrates=" + maxCarbohydrates +
                ", maxCalories=" + maxCalories +
                ", productList=" + Arrays.toString(productList) +
                '}';
    }

}
