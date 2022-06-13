package ru.itmo.lessons.courseworks.game2.menu;

import java.io.*;

import ru.itmo.lessons.courseworks.game2.logic.LoadingClass;
import ru.itmo.lessons.courseworks.game2.logic.LogicGame;
import ru.itmo.lessons.courseworks.game2.logic.SaverClass;
import ru.itmo.lessons.courseworks.game2.logic.Scenes;

public class JobMenu {
    LogicGame logicGame = new LogicGame();
    Scenes firstScene = Scenes.getScenesByCode("firstSceneCode");
    SaverClass saverClass = new SaverClass();
    LoadingClass loadingClass = new LoadingClass();

    public void startGame() {
        logicGame.showScene(firstScene.getSceneScene(), firstScene.getSceneCode());
    }

    public void saveGame() {
        saverClass.saveScene();
        System.out.println("====>игра сохранена<====");
    }

    public void loadGame() {
        loadingClass.loadingScene();
    }

    public void exitGame() {
        System.out.println("====>Игра окончена<====");
    }
}
