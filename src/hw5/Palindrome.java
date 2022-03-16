package hw5;

public class Palindrome {
    public static void main(String[] args) {
        String word = "а роза упала на лапу Азора";
        String newStr = word.toLowerCase().replaceAll(" ", "");

        StringBuilder sb = new StringBuilder();
        sb.append(newStr).reverse();
        System.out.println(newStr.toString().equals(sb.toString())?"Палиндром":"Не палиндром");

    }


}

