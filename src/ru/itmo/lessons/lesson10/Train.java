package ru.itmo.lessons.lesson10;

import ru.itmo.lessons.lesson10.base.Properties;
import ru.itmo.lessons.lesson10.base.Fix;


public class Train extends Properties  {
    private int countOfVagons;

    public Train(String color, String company, int level, int countOfVagons) {
        super(color, company, level);
        this.countOfVagons = countOfVagons;
    }


    @Override
    public String toString() {
        return "Train{" +
                "countOfVagons=" + countOfVagons +
                "countOfVagons='" + countOfVagons + '\'' +
                "color='" + this.getColor() + '\'' +
                ", company='" + this.getCompany() + '\'' +
                ", level=" + this.getLevel() +
                '}';
    }
}
