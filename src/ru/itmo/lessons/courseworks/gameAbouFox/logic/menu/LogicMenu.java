package ru.itmo.lessons.courseworks.gameAbouFox.logic.menu;

import ru.itmo.lessons.courseworks.gameAbouFox.logic.menu.commandsMenu.ExitGame;
import ru.itmo.lessons.courseworks.gameAbouFox.logic.menu.commandsMenu.LoadGame;
import ru.itmo.lessons.courseworks.gameAbouFox.logic.menu.commandsMenu.SaveCommand;
import ru.itmo.lessons.courseworks.gameAbouFox.logic.menu.commandsMenu.StartCommand;

import java.util.Scanner;

public class LogicMenu {


    public void firstMenu(){
        System.out.println("_______МЕНЮ_______\n1. Начать игру\n" +
                "2. Загрузить игру\n" +
                "3. Выйти\nВыберите пукнт меню: ");
    }

    public void checkValueforFirstMenu(int num)  {
        if (num > 3 || num < 1) {
            System.out.println("Введите корректно значение\n");
            firstMenu();
            commandForFirstMenu();
        }
    }

    public void secondMenu() {
        System.out.println("_______МЕНЮ_______\n" +
                "1. Сохранить игру\n" +
                "2. Загрузить игру\n" +
                "3. Выйти\nВыберите пукнт меню: ");
        commandForSecondMenu();

    }

    public void checkValueForSecondMenu(int num)  {
        if (num > 3 || num < 1)  {
            System.out.println("Введите корректно значение\n");
            secondMenu();
            commandForFirstMenu();
        }
    }

    public void commandForFirstMenu()  {
        JobMenu menu = new JobMenu();
        Menu startMenu = new Menu(
                new StartCommand(menu),
                new LoadGame(menu),
                new ExitGame(menu)
        );
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        checkValueforFirstMenu(num);
        switch (num) {
            case 1 -> startMenu.startGame();
            case 2 -> startMenu.loadGame();
            case 3 -> startMenu.exitGame();
        }
    }

    public void commandForSecondMenu()  {
        JobMenu menu = new JobMenu();
        Menu startMenu = new Menu(
                new SaveCommand(menu),
                new LoadGame(menu),
                new ExitGame(menu)
        );
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        checkValueForSecondMenu(num);
        switch (num) {
            case 1:
                startMenu.saveGame();
                break;
            case 2:
                startMenu.loadGame();
                break;
            case 3:
                startMenu.exitGame();
                break;

        }
    }
}
