package hw1;

public class TernaryOperator {
    public static void main(String[] args) {
        double sum = 454000, sale = 10.0;
        double price = 100_000;
        double result = sum > price?sum-(sum*sale/100):sum;

        System.out.println(result);
    }
}