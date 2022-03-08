package hw2;

public class GradeOptions {
    public static void main(String[] args) {
        int count = 0;

        if (count >= 90 && count <= 100) {
            System.out.println("Отлично");
        } else if (count <= 89 && count >= 60) {
            System.out.println("Хорошо");
        } else if (count <= 59 && count >= 40) {
            System.out.println("удовлетворительно");
        } else if (count <= 39 || count == 0) {
            System.out.println("Попробуйте в следующий раз");
        } else System.out.println("Ошибка, таких баллов нет");

    }
}
