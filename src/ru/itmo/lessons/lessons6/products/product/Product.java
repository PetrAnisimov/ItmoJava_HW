package ru.itmo.lessons.lessons6.products.product;

public class Product {
    public static String nameOfProduct;
    private int proteins;
    private int fats;
    private int carbohydrates;
    private int calories;

    public Product() {

    }

    public Product(int proteins, int fats, int carbohydrates, int calories, String nameOfProduct) {
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
        this.nameOfProduct = nameOfProduct;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        if (proteins == 0) throw new IllegalArgumentException("proteins should be more 0");
        this.proteins = proteins;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        if (fats == 0) throw new IllegalArgumentException("fats should be more 0 ");
        this.fats = fats;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        if (carbohydrates == 0) throw new IllegalArgumentException("carbohydrates should be more 0 ");
        this.carbohydrates = carbohydrates;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        if (calories == 0) throw new IllegalArgumentException("calories should be more 0 ");
        this.calories = calories;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        if (nameOfProduct == null || nameOfProduct.length() < 2) throw new IllegalArgumentException("Name cannot be empty or less than two characters");
        this.nameOfProduct = nameOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", calories=" + calories +
                '}';
    }
}
/*
Свойства: название продукта / белки / жиры / углеводы / калории
Минимум 4 конструктора
Реализовать необходимые проверки входящих данных
Создать не менее 4 экземпляров данного класса (объектов)
 */
