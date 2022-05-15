package ru.itmo.lessons.courseworks.game;

import ru.itmo.lessons.courseworks.game.menu.LogicMenu;

public class Game {
    LogicMenu lm = new LogicMenu();

    public void menu(){
        lm.firstMenu();
        lm.commandForFirstMenu();
    }
}
