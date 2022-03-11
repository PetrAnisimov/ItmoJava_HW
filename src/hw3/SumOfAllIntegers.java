package hw3;

import java.util.Scanner;

public class SumOfAllIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите число");
        int num = sc.nextInt();
       // boolean res = true;


        while (num!=0){
            sum += num % 10;
            num /=10;
        }
        System.out.println(sum);

    }
}
//        while (res) {
//            System.out.print("Введите целое положительное число: ");
//            if (num != 0) {
//                sum += num % 10;
//                num /= 10;
//                System.out.println(num);
//            } else res = false;
//        }
//    }
//}

//            System.out.print("Введите целое положительное число: ");
//            int num = sc.nextInt();
//            if (num != 0) {
//                System.out.println(num / 10 + num % 10);
//            } else res = false;

// }
