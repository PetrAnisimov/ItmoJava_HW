package ru.itmo.lessons.lesson10;

import ru.itmo.lessons.lesson10.base.Fix;
import ru.itmo.lessons.lesson10.base.Properties;

public class Car extends Properties implements Fix {
    private int number;


    public Car(String color, String company, int level) {
        super(color, company, level);
    }

    @Override
    public void fixing() {
        this.setLevel(this.getLevel() + 2);

        }


    }




