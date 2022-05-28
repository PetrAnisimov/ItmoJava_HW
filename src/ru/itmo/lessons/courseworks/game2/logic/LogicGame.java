package ru.itmo.lessons.courseworks.game2.logic;

import ru.itmo.lessons.courseworks.game2.menu.LogicMenu;

import java.util.Scanner;

public class LogicGame {
    Scanner scanner = new Scanner(System.in);
    LogicMenu logicMenu = new LogicMenu();

    public void showScene(String sceneScene, String sceneCode) {
        System.out.println(sceneScene);
        chuseAnswear(sceneCode);
    }
//    public String showScene(String sceneScene, String sceneCode) {
//        System.out.println(sceneScene);
//        chuseAnswear(sceneCode);
//        return sceneScene;
//    }

    public String showText(String sceneScene) {
        System.out.println(sceneScene);
        return sceneScene;
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
        if (checkValueFromAnsewr(num)) {
            switch (num) {
                case 1 -> {
                    var first = Scenes.getScenesByCode(sceneCode).getFirst();
                    showScene(first.getSceneScene(), first.getSceneCode());
                }

                case 2 -> {
                    var second = Scenes.getScenesByCode(sceneCode).getSecond();
                    showScene(second.getSceneScene(),second.getSceneCode());
                }


                case 3 -> logicMenu.secondMenu();

            }

        }
    }
}