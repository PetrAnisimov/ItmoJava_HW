import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i *2;
        }
        System.out.println(Arrays.toString(arr)); //[0, 2, 4, 6, 8, 10, 12, 14, 16, 18]


        int[] ints7 = {3, -6, 12, 0, 4};
        // for позволяет изменить значение элемента массива
        //  0   1   2  3  4
        // [3, -6, 12, 0, 4]
        int summ = 0;
        for (int index = 0; index < ints7.length; index += 1) {
            ints7[index] *= ints7[index];
            summ += ints7[index];
        }
        System.out.println(summ);
    }
}
