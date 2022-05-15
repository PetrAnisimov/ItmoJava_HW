package ru.itmo.lessons.courseworks.game.logicSceneAndGame;

import ru.itmo.lessons.courseworks.game.Scenes;

import java.util.HashMap;

public class Steps {
    static Scenes scenes = new Scenes();


    public static HashMap<String, String> getSceneFirstСhoice() {
        return new HashMap<>() {{
            put(scenes.codeFirstScene, scenes.showScene(scenes.goHomeAction()));
            put(scenes.codeAskAboutLittleSquirrel, scenes.askAboutLittleSquirrelAction());
        }};
    }

    public HashMap<String, String> getSceneSecondСhoice() {
        return new HashMap<>() {{
            put(scenes.codeFirstScene, scenes.goToSearchAction());
            put(scenes.codeAskAboutLittleSquirrel, scenes.searchLittleSquirrelAloneAction());
        }};
    }


}
