package ru.itmo.lessons.courseworks.gameAbouFox.logic;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LoadingClass {
    LogicGame logicGame = new LogicGame();


    public void loadingScene() {

        try (FileReader reader = new FileReader("saveScenes.txt")) {
            Scanner scan = new Scanner(reader);
            while (scan.hasNextLine()) {
                Scenes loadScene = Scenes.getScenesByCode(scan.nextLine());
                logicGame.showScene(loadScene.getSceneScene(), loadScene.getSceneCode());
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
