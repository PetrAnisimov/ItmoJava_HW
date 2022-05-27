package ru.itmo.lessons.courseworks.game2.logic;

import java.util.HashMap;
import java.util.Map;

public class Steps {
    static Scenes scenes = new Scenes();


    HashMap<String, String> scenesForFirstСhoice = new HashMap<>() {{
        put(scenes.firstSceneCode, scenes.finalSceneScene);
        put(scenes.askAboutSquirrelToDwellersCode, scenes.askAboutSquirrelToDwellersScene);
    }};

    HashMap<String, String> scenesForSecondСhoice = new HashMap<>() {{
        put(scenes.firstSceneCode, scenes.goToSearchScene);
        put(scenes.finalScene2Code, scenes.finalScene2Scene);
    }};

}

