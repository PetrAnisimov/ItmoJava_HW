package ru.itmo.lessons.courseworks.game.menu;


import ru.itmo.lessons.courseworks.game.Scenes;
import ru.itmo.lessons.courseworks.game.logicSceneAndGame.LogicGame;

public class JobMenu {
    LogicGame lg = new LogicGame();

    public void startGame(){
        Scenes scenes = new Scenes();
        scenes.firstSceneAction();


    }

    public void saveGame(){
        System.out.println("сохранение игры");
    }

    public void loadGame(){
        System.out.println("загрузка игры");
    }

    public void exitGame(){
        System.out.println("Игра оконченна");
        return;
    }
}
