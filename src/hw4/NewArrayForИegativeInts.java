package hw4;

import java.util.Arrays;

public class NewArrayForИegativeInts {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 11, 13, 15, 14, 16, 17, 18};
        Arrays.sort(array);
        int x = 0, y = 0;
        System.out.println("Ваш массив: " + Arrays.toString(array));
        for (int elements : array) {
            if (elements % 2 == 0) x++;
            if (elements % 2 != 0) y++;
        }
        int[] arr1 = new int[x];
        int[] arr2 = new int[y];
        y = 0;
        x = 0;
        for (int elements : array) {
            if (elements % 2 == 0) arr1[x++] = elements;
            if (elements % 2 != 0) arr2[y++] = elements;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("Четные элементы массива " + Arrays.toString(arr1));
        System.out.println("Не четные элементы массива " + Arrays.toString(arr2));
    }
}