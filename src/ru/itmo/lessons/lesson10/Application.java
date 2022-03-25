package ru.itmo.lessons.lesson10;

public class Application {
    public static void main(String[] args) {
        Car car = new Car("Черный","vw",3);
        car.changeColor("белый");
        car.fixing();

        Bycicle bycicle = new Bycicle("Черный","norco",2,"горный");
        bycicle.changeColor("белый");
        bycicle.fixing();

        Train train = new Train("Серый","УВЗ",3,2);
        System.out.println(train.toString());
        train.changeColor("Белый");

        Garage garage = new Garage();
        garage.addToGarage(car);
        System.out.println(garage.toString());
        garage.addToGarage(bycicle);

    }
}
