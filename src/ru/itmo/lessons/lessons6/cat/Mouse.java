package ru.itmo.lessons.lessons6.cat;

import ru.itmo.lessons.lessons6.cat.base.Speed;

public class Mouse extends Speed {

    public Mouse(int speed) {
        setSpeed(speed);
    }

    @Override
    public String toString() {
        return "Мышь{" +
                "speed=" + speed +
                '}';
    }
}
