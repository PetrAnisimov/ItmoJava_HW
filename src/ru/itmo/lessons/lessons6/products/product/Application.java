package ru.itmo.lessons.lessons6.products.product;

public class Application {
    public static void main(String[] args) {
        Product pirog = new Product(44,44,40,50,"pirog");
        MyProducts pirogi = new MyProducts();
        pirogi.addProduct(pirog);
        System.out.println(pirog.toString());

        Product coockies = new Product();
        coockies.setCalories(11);
        coockies.setCarbohydrates(100);
        coockies.setFats(10);
        coockies.setProteins(10);
        coockies.setNameOfProduct("Coockies");


        MyProducts coockie = new MyProducts();
        coockie.addProduct(coockies);
        System.out.println(coockie.toString());

        Product coockies2 = new Product();
        coockies2.setCalories(11);
        coockies2.setCarbohydrates(100);
        coockies2.setFats(10);
        coockies2.setProteins(10);
        coockies2.setNameOfProduct("Coockies");


        MyProducts coockies3 = new MyProducts();
        coockies3.addProduct(coockies);
        System.out.println(coockies2.toString());



    }


}
