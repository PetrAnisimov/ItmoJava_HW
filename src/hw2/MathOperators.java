package hw2;

public class MathOperators {
    public static void main(String[] args) {
        int num1 = 22, num2 = 4;
        int operator = 3;

        switch (operator) {
            case 3:
                System.out.println("Сумма (числа " + num1 + ") и (числа " + num2 + ") равна " + (num1 + num2));
                break;
            case 5:
                System.out.println("Разность (числа " + num1 + ") и (числа " + num2 + ") равна " + (num1 - num2));
                break;
            case 7:
                System.out.println("Умножение (числа " + num1 + ") на (число " + num2 + ") равно " + (num1 * num2));
                break;
            case 9:
                System.out.println("Деление (числа " + num1 + ") на (число " + num2 + ") равно " + (num1 / num2));
                break;
            case 0: //фича :)
                System.out.println("получение остатка от (числа " + num1 + ") и (числа " + num2 + ") остаток = " + (num1 % num2));
                break;
            default:
                System.out.println("Вводимое число => " + operator + " <= не является оператором или ошибочно");
        }
    }

}
