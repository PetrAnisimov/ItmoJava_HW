package hw3;

import java.util.Scanner;

public class GuessInt {
    public static void main(String[] args) {
        int a = 1, b = 9;
        boolean res = true;

        int randomNum = a + (int) (Math.random() * b);
        System.out.println("===>Загаданное число:" + randomNum + "<===\n");
        System.out.println("Я загадал число, от 1 до 9! Твоя задача отгадать его");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");


        while (res) {
            int usersNum = sc.nextInt();

            if (randomNum == usersNum) {
                System.out.println("Вы выйграли");
                res = false;
            } else if (usersNum == 0) {
                System.out.println("Выход из программы");
                res = false;
            } else if (randomNum > usersNum) {
                System.out.println("Загаданное число больше");
            } else if (randomNum < usersNum) {
                System.out.println("Загаданное число меньше");
            }


        }
    }
}
