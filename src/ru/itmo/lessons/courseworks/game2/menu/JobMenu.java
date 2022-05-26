package ru.itmo.lessons.courseworks.game2.menu;


import ru.itmo.lessons.courseworks.game.menu.commandsMenu.LoadGame;
import ru.itmo.lessons.courseworks.game2.logic.LogicGame;
import ru.itmo.lessons.courseworks.game2.logic.Scenes;
import ru.itmo.lessons.courseworks.game2.logic.Steps;

public class JobMenu {
    Steps steps = new Steps();
    Scenes scenes = new Scenes();

    public void startGame() {
       steps.showScene(scenes.firstSceneAction);

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
