package hw2;

public class CheckIntegerRange {
    public static void main(String[] args) {
        int startRangeForNum = 10, endRangeForNum = 500;
        int startRange = 25, endRange = 200;

        //привел к int так как Math.randome() возвращает double
        int testNum = startRangeForNum + (int) (Math.random() * endRangeForNum);

        if (testNum < endRange) {
            System.out.println("Число => " + testNum + ", СОДЕРЖИТСЯ в диапазоне от 25 до 200");
        } else System.out.println("Число => " + testNum + ", НЕ содержится в диапазоне от 25 до 200");


    }
}
