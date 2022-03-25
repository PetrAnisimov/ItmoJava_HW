package ru.itmo.lessons.lesson10;

import ru.itmo.lessons.lesson10.base.Fix;
import ru.itmo.lessons.lesson10.base.Properties;

import java.util.Arrays;

public class Garage {

    private Properties[] transports = new Properties[3];

    public void addToGarage(Properties transports){
        for (int i = 0; i < this.transports.length; i++) {
            if (this.transports[i] == null){
                this.transports[i] = transports;
                return;
            }


        }
    }


    public void fixing() {
        for (Properties transport : transports) {
            if (transport instanceof Fix){
                ((Fix) transport).fixing();
            }
            System.out.println("Этот тип транспортного средства" +
                    "нельзя чинить");
        }
    }


    @Override
    public String toString() {
        return "Garage{" +
                "transports=" + Arrays.toString(transports) +
                '}';
    }
}
/*
Мастерская
    хранит массив транспортных средств (машины, велосипеды, поезда) +
    метод ремонтировать
        ремонтирует все транспортные средства, которые
        можно отремонтировать
    метод перекрасить
        можно перекрасить любое транспортное средство
 */