package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.Lessons;
import ru.itmo.lessons.lesson7.base.Prorepties;

public class Teacher extends Prorepties {
    private int maxSkillVal;
    private Lessons lessons;

    public Teacher(String name, int age) {
        super(name, age);
    }

    //через конструктор задам значение (maxSkillVal)
    public Teacher(String name, int age, int maxSkillVal) {
        super(name, age);
        this.maxSkillVal = maxSkillVal;
    }

    //метод: учить(обучаемый)
    public void teach(Pupil pupil){
        pupil.study(maxSkillVal);
    }


}
/*

class Учитель {
       int навык; значение задать через конструктор
       учить(Pupil pupil){
             pupil.учиться(навык);
       }

}


Класс Учитель создается со следующими
харатеристиками:
имя (тип String) +
возраст (тип int) +
название преподаваемого предмета (тип String) +
навык учителя (тип int) - максисмум, на который может быть увеличен уровень значний ученика +
методом: учить(обучаемый)
 */