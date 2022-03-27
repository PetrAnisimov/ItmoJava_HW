package ru.itmo.lessons.lessons6.cat;

import ru.itmo.lessons.lessons6.cat.base.Speed;

import java.util.Arrays;

public class Cat extends Speed {
    private String nameOfCat;
    private int weight;
    private int caoughtMouses;
    private int maxCountOfCoughtMouses = 100;
    private Mouse[] mice = new Mouse[10];


    public Cat(String nameOfCat, int weight, int caoughtMouses, int speed) {
        this.nameOfCat = nameOfCat;
        this.weight = weight;
        this.caoughtMouses = caoughtMouses;
        this.setSpeed(speed);
    }

    public String getNameOfCat() {
        return nameOfCat;
    }

    public void setNameOfCat(String nameOfCat) {
        if (nameOfCat == null || nameOfCat.length() < 2) throw new IllegalArgumentException("name не может быть " +
                "пустым или равен Null");
        this.nameOfCat = nameOfCat;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 0) throw new IllegalArgumentException("weight не может быть меньше нуля");
        this.weight = weight;
    }


    public int getCaoughtMouses() {
        return caoughtMouses;
    }

    public void setCaoughtMouses(int caoughtMouses) {
        this.caoughtMouses = caoughtMouses;
    }

    public void catchMice(Mouse mouse) {
        if (this.getCaoughtMouses() >= this.maxCountOfCoughtMouses) {
            System.out.println("у кота " + this.nameOfCat +
                    "а больше 100 мышей");
            return;
        }

        if (this.getSpeed() < mouse.getSpeed()) {
            System.out.println("Скорость кота " + this.nameOfCat + "а ниже чем у мышки");
            return;
        }
        for (int i = 0; i < mice.length; i++) {
            if (mice[i] == null) {
                mice[i] = mouse;
                caoughtMouses += 1;
                System.out.println(mouse + "поймана");
                return;
            }
        }
    }

    public void battle(Cat anatherCat) {
        if (this.getWeight() > anatherCat.getWeight()) {
            System.out.println("кот " + this.nameOfCat + " с количествоем мышей (" + this.caoughtMouses + ") напал" +
                    " на кота " + anatherCat.nameOfCat + " с колчиством мышей (" + anatherCat.caoughtMouses + ")\n => " +
                    "началась драка <=");

            this.caoughtMouses += anatherCat.caoughtMouses;
            anatherCat.caoughtMouses -= anatherCat.caoughtMouses;

            System.out.println("теперь у кота " + this.nameOfCat + " количество мышей (" + this.caoughtMouses + ") а у кота " +
                    anatherCat.nameOfCat + " количество мышей (" + anatherCat.caoughtMouses + ")"+"\n\uD83D\uDE2D");

        }
        else System.out.println("Кот " + this.nameOfCat + " меньше чем кот "+ anatherCat.nameOfCat);
    }


    //для теста

    @Override
    public String toString() {
        return "Cat{" +
                "Имя кота='" + nameOfCat + '\'' +
                ", Вес кота=" + weight +
                ", количество пойманных мышей=" + caoughtMouses +
                ", mice=" + Arrays.toString(mice) +
                '}';
    }


}