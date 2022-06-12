package ru.itmo.lessons.courseworks.gameAbouFox.logic;

import java.io.FileWriter;
import java.io.IOException;

public class SaverClass {

    LogicGame logicGame = new LogicGame();

    public void saveScene() {
        try (FileWriter writer = new FileWriter("saveScenes.txt", false)) {
            writer.write(logicGame.getSaver());
            writer.append('\n');
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}