package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayThrowScanner {
    public static void main(String[] args) {
        boolean res = true;
        while (res) {
            Scanner sc = new Scanner(System.in);
            String[] array = new String[5];
            for (int i = 0; i < array.length; i++) {
                System.out.print("Введите слово: ");
                String wordForArray = sc.nextLine();
                if (wordForArray.equals("exit")) break;
                array[i] = wordForArray;

            }
            System.out.println("Ваш массив: " + Arrays.toString(array));
            res = false;


        }


    }
}