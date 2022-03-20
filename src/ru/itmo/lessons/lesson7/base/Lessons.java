package ru.itmo.lessons.lesson7.base;

public class Lessons {
    protected String lessonName;


    public Lessons(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        if (lessonName == null || lessonName.length() < 3)
            throw new IllegalArgumentException("lessonName не может быть null или меньше 3");
        this.lessonName = lessonName;
    }
}
//Можно еще один родительский создать и в него вынести предмет, а потом от него наследовать ученика и учителя