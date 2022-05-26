package ru.itmo.lessons.courseworks.game2.logic;

import java.util.HashMap;

public class DecoderScenes {
    Scenes scenes = new Scenes();
    Steps steps = new Steps();
    LogicGame logicGame = new LogicGame();

    public String nextFirstScene(String code) {
        System.out.println(scenesForFirstСhoice.get(code));

        return code;
    }
    public String nextSecondScene(String code) {
        System.out.println(scenesForSecondСhoice.get(code));
        return code;
    }

    HashMap<String, String> scenesForFirstСhoice = new HashMap<>() {{
        put("firstSceneCode", scenes.finalSceneScene);
    }};

    HashMap<String, String> scenesForSecondСhoice = new HashMap<>() {{
        put("firstSceneCode", scenes.goToSearchScene);

    }};

}
