package ru.itmo.lessons.courseworks.game2;


import ru.itmo.lessons.courseworks.game2.menu.LogicMenu;

public class AppGame {
    public static void main(String[] args) {
        LogicMenu logicMenu = new LogicMenu();
        logicMenu.firstMenu();
        logicMenu.commandForFirstMenu();
    }
}
