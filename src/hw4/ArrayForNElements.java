package hw4;

import java.util.Arrays;

public class ArrayForNElements {
    public static void main(String[] args) {
        int startRange = 3, endRange = 10, summ = 0;
        int randomInt = startRange + (int) (Math.random() * endRange);

        //int[] array = new int[randomInt];//массив создается со случайным количеством
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int randomElement = startRange + (int) (Math.random() * endRange);
            array[i] += randomElement;

        }
        for (int elements : array) {
            summ += elements;
        }
        int minValue = array[startRange], maxValue = array[endRange - 1], midleValue = summ / 10;


        for (int elements : array) {
            if (minValue > elements) minValue = elements;
            if (maxValue < elements) maxValue = elements;


        }
        System.out.println("Весь массив = :" + Arrays.toString(array));
        System.out.println("Минимальное значение массива: " + minValue);
        System.out.println("Максимальное значение массива: " + maxValue);
        System.out.println("Среднее значение массива: " + midleValue);


    }
}
