package ru.itmo.lessons.courseworks.game2;


import ru.itmo.lessons.courseworks.game2.menu.LogicMenu;

import java.io.FileNotFoundException;

public class AppGame {
    public static void main(String[] args) throws FileNotFoundException {
        LogicMenu logicMenu = new LogicMenu();
        logicMenu.firstMenu();
        logicMenu.commandForFirstMenu();
    }
}
