package ru.itmo.lessons.courseworks.game2.menu;

import ru.itmo.lessons.courseworks.game2.logic.LogicGame;
import ru.itmo.lessons.courseworks.game2.logic.Scenes;


public class JobMenu {
    Scenes scenes = new Scenes();
    LogicGame logicGame = new LogicGame();

    public void startGame() {
        logicGame.showScene(scenes.firstSceneAction,scenes.firstSceneCode);
    }

    public void saveGame() {
        System.out.println("сохранение игры");
    }

    public void loadGame() {
        System.out.println("загрузка игры");
    }

    public void exitGame() {
        System.out.println("Игра окончена");
    }
}
