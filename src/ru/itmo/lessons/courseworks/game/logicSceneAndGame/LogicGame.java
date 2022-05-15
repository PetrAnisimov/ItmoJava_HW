package ru.itmo.lessons.courseworks.game.logicSceneAndGame;


import ru.itmo.lessons.courseworks.game.menu.LogicMenu;

import java.util.Scanner;

public class LogicGame {

    LogicMenu lm = new LogicMenu();
    Scanner scanner = new Scanner(System.in);


    public boolean checkValueFromAnsewr(int num) {
        if (num > 3 || num < 1) {
            System.out.println("Введите корректно значение\n");
        }
        return false;
    }

    private void firstStep(String code) {
        DecoderScenes decoder = new DecoderScenes(); // почему я не могу вынести его в класс
        decoder.decoderFirstButton(code);
    }

    private void secondStep(String code) {
        DecoderScenes decoder = new DecoderScenes();
        decoder.decoderSecondButton(code);
    }

    public void chuseAnswear(String code) { //codeAskAboutLittleSquirrel
        int num = scanner.nextInt();
        checkValueFromAnsewr(num);
        switch (num) {
            case 1:
                firstStep(code);
                break;
            case 2:
                secondStep(code);
                break;
            case 3:
                lm.secondMenu();
                break;
        }
    }
}



