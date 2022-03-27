package ru.itmo.lessons.lessons6.cat;

public class Application {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Персик",12,1,33);
        Mouse mouse = new Mouse(31);
        cat1.catchMice(mouse);
        System.out.println(cat1.toString());
        System.out.println("------------------------------------------");
        System.out.println("------------------------------------------");



        Cat cat2 = new Cat("Барсик",19,1,33);
        Mouse mouse2 = new Mouse(111);
        cat2.catchMice(mouse);
        System.out.println(cat2.toString());


        Cat cat3 = new Cat("Марсик",19,100,44);
        Mouse mouse3 = new Mouse(33);
        cat3.catchMice(mouse3);
        System.out.println(cat3.toString());

        Cat cat4 = new Cat("Драчун",10,11,12);
        Mouse mouse4 = new Mouse(31);
        cat4.catchMice(mouse2);

        Cat cat5 = new Cat("Боюн",11,0,12);
        Cat cat6 = new Cat("Боюн2",11,11,12);


        cat5.battle(cat4);


    }
}
