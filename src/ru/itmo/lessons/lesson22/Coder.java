package ru.itmo.lessons.lesson22;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Coder extends FilterOutputStream {
    private String key;
    public Coder(OutputStream out, String key) {
        super(out);
        this.key = key;
    }

    @Override
    public void write(byte[] b) throws IOException {
        for(int i = 0;i< b.length;i++){
            b[i] = (byte) (b[i]^ key.getBytes()[i%key.getBytes().length]);
        }
        System.out.println();

        //зашифровали (массив)
        //вызвали метод write родителя

        super.write(b);
    }
}

