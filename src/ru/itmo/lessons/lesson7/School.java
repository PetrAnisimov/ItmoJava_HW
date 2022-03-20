package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.Lessons;
import ru.itmo.lessons.lesson7.base.Prorepties;
import ru.itmo.lessons.lesson7.Pupil;

public class School extends Lessons {
    private String nameOfSchool;
    private Director director;
    private Teacher teacher;
    private Pupil pupil;
    private Teacher[] teachers = new Teacher[3];
    private Pupil[] pupils = new Pupil[3];

    public School(String lessonName) {
        super(lessonName);
    }

    public School(String lessonName, String nameOfSchool, Director director, Teacher teacher, Pupil pupil) {
        super(lessonName);
        this.nameOfSchool = nameOfSchool;
        this.director = director;
        this.teacher = teacher;
        this.pupil = pupil;
    }

    public void dayAtSchool(Director director, Teacher teacher){
        director.startOfLessons();
        if (lessonName.equals(lessonName)) {
            teacher.teach(pupil);
        }

        director.endOfLessons();


}


}
/*
Класс Школа создается со следующими

харатеристиками:

название - задается при создании объекта и не может быть изменено в последствии +
директор - школа не может функционировать без директора +
учителя[] - массив
ученики[] - массив
методом:

день в школе():
 - директор объявляет начало занятий
 - учителя учат учеников (предмет учителя и ученика должны совпадать, уровень знаний ученика в процессе обучения должен увеличиваться)
 - директор объявляет окончание занятий

 */