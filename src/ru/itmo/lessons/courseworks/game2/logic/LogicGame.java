package ru.itmo.lessons.courseworks.game2.logic;

import ru.itmo.lessons.courseworks.game2.menu.LogicMenu;

import java.util.Scanner;

public class LogicGame {

    Scanner scanner = new Scanner(System.in);
    LogicMenu logicMenu = new LogicMenu();
    static String saver;

    public static String getSaver() {
        return saver;
    }

    public static void setSaver(String saver) {
        LogicGame.saver = saver;
    }

    public void showScene(String sceneScene, String sceneCode) {
        System.out.println(sceneScene);
        chuseAnswear(sceneCode);
    }

    public boolean checkValueFromAnsewr(int num) {
        if (num > 3 || num < 1) {
            System.out.println("Введите корректно значение\n");
            return false;
        }
        return true;
    }

    public void chuseAnswear(String sceneCode) {
        int num = scanner.nextInt();
        setSaver(sceneCode);
        if (checkValueFromAnsewr(num)) {
            switch (num) {
                case 1 -> {
                    Scenes first = Scenes.getScenesByCode(sceneCode).getFirst();
                    showScene(first.getSceneScene(), first.getSceneCode());
                }
                case 2 -> {
                    Scenes second = Scenes.getScenesByCode(sceneCode).getSecond();
                    showScene(second.getSceneScene(), second.getSceneCode());
                }
                case 3 -> logicMenu.secondMenu();
            }
        }
    }

}



