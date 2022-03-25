package ru.itmo.lessons.lesson10;

import ru.itmo.lessons.lesson10.base.Fix;
import ru.itmo.lessons.lesson10.base.Properties;

public class Bycicle extends Properties implements Fix {
    private String type;

    public Bycicle(String color, String company, int level, String type) {
        super(color, company, level);
        this.type = type;
    }



    @Override
    public void fixing() {
        this.setLevel(this.getLevel() + 1);

    }

    @Override
    public String toString() {
        return "Bycicle{" +
                "type='" + type + '\'' +
                "color='" + this.getColor() + '\'' +
                ", company='" + this.getCompany() + '\'' +
                ", level=" + this.getLevel() +
                '}';
    }
}
