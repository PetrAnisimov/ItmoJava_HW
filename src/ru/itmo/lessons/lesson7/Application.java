package ru.itmo.lessons.lesson7;

import ru.itmo.lessons.lesson7.base.Lessons;

public class Application {
    public static void main(String[] args) {
        Lessons lessons = new Lessons("math");
        Pupil pupil = new Pupil("Petr", 13, lessons, 12);
        Teacher teacher = new Teacher("Pavel", 31, 10);
        Director director = new Director("Alex", 56);
        School school= new School(lessons,"107",director,teacher,pupil);


    }
}