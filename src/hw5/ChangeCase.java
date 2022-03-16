package hw5;


import java.util.Locale;

public class ChangeCase {
    public static void main(String[] args) {
        String word = "hello";
        System.out.println();
        System.out.println(word.toLowerCase()
                .substring(0, 1)
                .toUpperCase() + word.substring(1)
                .toLowerCase());

        }

    }
//TODO Заменить все буквы в слове на строчные, а первую букву на заглавную.
// Например, дано hello, получаем Hello / дано HeLLO, получаем Hello.