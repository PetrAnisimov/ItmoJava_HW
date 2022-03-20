package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.Lessons;
import ru.itmo.lessons.lesson7.base.Prorepties;

public class Pupil extends Prorepties {
    private Lessons lessonName;
    private int skillsPupil = 0;

    public Pupil(String name, int age, Lessons lessonName, int skillsPupil) {
        super(name, age);
        this.lessonName = lessonName;
        this.skillsPupil = skillsPupil;
    }



    public void study(int skillsPupil) {
        this.skillsPupil += (int) (Math.random() * this.skillsPupil);
    }
}
/*

class Pupil {
     int skillsPupil; изначально 0
     учиться(int навык) {
             увеличить skillsPupil на рандом в диапазоне  от 0 до навык
      }
}

Класс Ученик создается со следующими
характеристиками:
имя (тип String) +
возраст (тип int) +
название изучаемого предмета (тип String) +
уровень знаний (тип int) +
методом:

учиться(навык_учителя) - уровень знаний ученика повышается на рандомное значение в диапазоне [0, навык_учителя]

 */