package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.Prorepties;

public class Director extends Prorepties {

    public Director(String name, int age) {
        super(name, age);
    }


    public void startOfLessons(){
        System.out.println("Начало занятий");
    }

    public void endOfLessons(){
        System.out.println("Окончание занятий");
    }
}
/*
Класс Директор создается со следующими
харатеристиками:
имя (тип String) +
возраст (тип int) +
методами:
объявить начало занятий() - вывод информации в косоль
объявить окончание занятий занятий() - вывод информации в косоль
 */