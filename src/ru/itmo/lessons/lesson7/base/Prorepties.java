package ru.itmo.lessons.lesson7.base;

abstract public class Prorepties {
    protected String name;
    protected int age;


    public Prorepties(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) throw new IllegalArgumentException("name не может быть меньше 3");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("age не может быть меньше нуля");
        this.age = age;
    }
}
//. Можно еще один родительский создать и в него вынести предмет, а потом от него наследовать ученика и учителя