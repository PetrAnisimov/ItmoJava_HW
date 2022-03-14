package hw4;

import java.util.Arrays;

public class NegtiveArray {
    public static void main(String[] args) {
        int[] array = {-1, -2, 3, -4, 5, -6, -7, -8, -9, 10, 12, 11, 13, 15, 14, 16};
        Arrays.sort(array);
        int x = 0;
        System.out.println("Ваш массив: " + Arrays.toString(array));
        for (int elements : array) {
            if (elements < 0) x++;
        }
        int[] arr1 = new int[x];
        x = 0;
        for (int elements : array) {
            if (elements  <0) arr1[x++] = elements;

        }
        System.out.println(Arrays.toString(arr1));
        }

    }


