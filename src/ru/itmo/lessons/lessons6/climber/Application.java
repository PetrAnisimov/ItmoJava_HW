package ru.itmo.lessons.lessons6.climber;

public class Application {
    public static void main(String[] args) {
        Mountain mountain1 = new Mountain();
        mountain1.setMountain("Гора1");
        mountain1.setCountry("Россия");
        mountain1.setHeight(122);

        Climber climber = new Climber();
        climber.setNameOfClimber("Петя");
        climber.setAddressOfClimber("Лесной 3");

        Climber climber1 = new Climber();
        climber1.setNameOfClimber("Антон");
        climber1.setAddressOfClimber("Литейный 4");

        Climber climber2 = new Climber();
        climber2.setNameOfClimber("Иван");
        climber2.setAddressOfClimber("Горки 4");

        Group group = new Group(true,mountain1);
        group.addToGroup(climber);
        group.addToGroup(climber1);
        group.addToGroup(climber2);
        System.out.println(group.toString());

        Mountain mountain = new Mountain();
        mountain.setHeight(110);
        mountain.setMountain("Эверест");
        mountain.setCountry("Грузия");

        Group group1 = new Group(false,mountain);
        group.addToGroup(climber);
        group.addToGroup(climber1);
        System.out.println(group1.toString());





    }


}
/*
В методе main (отдельного класса) создать:
3 группы для восхождений на 3 различных горы.
В первой группе 3 альпиниста (набор закрыт)
Во второй и третьей группах по 2 альпиниста (набор в эти группы открыт)
 */