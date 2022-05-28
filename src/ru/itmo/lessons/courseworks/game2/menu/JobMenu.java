package ru.itmo.lessons.courseworks.game2.menu;


import ru.itmo.lessons.courseworks.game2.logic.LogicGame;
import ru.itmo.lessons.courseworks.game2.logic.Scenes;

public class JobMenu {
    LogicGame logicGame = new LogicGame();
    Scenes firstScene = Scenes.getScenesByCode("firstSceneCode");

    public void startGame() {
        logicGame.showScene(firstScene.getSceneScene(), firstScene.getSceneCode());
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
