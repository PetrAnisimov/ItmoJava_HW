package ru.itmo.lessons.courseworks.game2.logic;

import ru.itmo.lessons.courseworks.game2.menu.LogicMenu;

import java.util.Scanner;

public class LogicGame {
    Scanner scanner = new Scanner(System.in);
    LogicMenu logicMenu = new LogicMenu();
    DecoderScenes decoderScenes = new DecoderScenes();

    public void showScene(String scene, String code){
        System.out.println(scene);
        chuseAnswear(code);
    }

    public void firstStep(String code) {
        decoderScenes.nextFirstScene(code);
    }

    public void secondStep(String code) {
        decoderScenes.nextSecondScene(code);
    }

    public boolean checkValueFromAnsewr(int num) {
        if (num > 3 || num < 1) {
            System.out.println("Введите корректно значение\n");
            return false;
        }
        return true;
    }

    public void chuseAnswear(String code) {
        int num = scanner.nextInt();
        if (checkValueFromAnsewr(num)) {
            switch (num) {
                case 1 -> firstStep(code);
                case 2 -> secondStep(code);
                case 3 -> logicMenu.secondMenu();

            }

        }
    }
}