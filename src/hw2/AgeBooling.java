package hw2;

public class AgeBooling {
    public static void main(String[] args) {
        int age = 34, exp = 6;

        if (age >= 100) {
            System.out.println("Мы вам перезвоним");
        } else if (exp <= 5) {
            System.out.println("Вы подходите на должность стажера");
        } else if (exp >= 5) {
            System.out.println("Вы подходите на должность разработчика");
        }
    }
}
