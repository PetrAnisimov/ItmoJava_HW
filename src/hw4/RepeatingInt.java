package hw4;

import java.util.Arrays;

public class RepeatingInt {
    public static void main(String[] args) {
        int countm1 = 0, count0 = 0, count1 = 0;
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            //беру диапазон 3
            int randomElementsForArray = (int) Math.round((Math.random() * 2) - 1);
            array[i] += randomElementsForArray;
        }

        for (int element : array) {
            if (element == 1) {
                count1 += 1;
            }
            if (element == 0) {
                count0 += 1;
            }
            if (element == -1)
                countm1 += 1;
        }
        System.out.println("Ваш массив: " + Arrays.toString(array));
        if (count1 > count0 && count1 > countm1) {
            System.out.println("число: 1 встречается в массиве чаще чем 0 и -1: Оно встретилось: " + count1 + " раз");
        } else if (count1 == count0 || count1 == countm1) {
            System.out.println("(-_-)");
        }
        if (count0 > count1 && count0 > countm1) {
            System.out.println("число: 0 встречается в массиве чаще чем 1 и -1: Оно встретилось: " + count0 + " раз");
        } else if (count0 == count1 && count0 == countm1) {
            System.out.println("(-_-)");

        }
        if (countm1 > count1 && countm1 > count0) {
            System.out.println("число: -1 встречается в массиве чаще чем 1 и 0: Оно встретилось: " + countm1 + " раз");
        } else if (countm1 == count1 && countm1 == count0) {
            System.out.println("(-_-)");


        }
        System.out.println("-------------------ПОДСКАЗКА-----------------------------------");
        System.out.println("число: 1 встречается в массиве " + count1 + " раз");
        System.out.println("число: 0 встречается в массиве " + count0 + " раз");
        System.out.println("число: -1 встречается в массиве " + countm1 + " раз");

        }

    }
