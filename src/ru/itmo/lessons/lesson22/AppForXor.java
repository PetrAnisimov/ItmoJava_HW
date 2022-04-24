package ru.itmo.lessons.lesson22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppForXor {
    public static void main(String[] args) throws IOException {
        Coder coder = new Coder(new FileOutputStream("test.txt"),"sdfsdf");
        coder.write("hello".getBytes());
        DeCoder deCoder = new DeCoder(new FileInputStream("test.txt"), "sdfsdf");
        byte[] bytes = new byte["hello".getBytes().length];
        deCoder.read(bytes);

        System.out.println(new String(bytes));
    }
}
