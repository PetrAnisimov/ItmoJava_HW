package hw2;


public class Calendare {
    public static void main(String[] args) {
        int month = 12;

        if (month > 11 || month <= 2) System.out.println("Зима");
        else if (month >= 3 && month <= 5) System.out.println("Вксна");
        else if (month >= 6 && month <= 8) System.out.println("Лето");
        else if (month >= 9 && month <= 11) System.out.println("Осень");

    }
}
