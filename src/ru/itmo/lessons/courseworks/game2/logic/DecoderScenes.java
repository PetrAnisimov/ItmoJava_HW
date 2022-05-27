package ru.itmo.lessons.courseworks.game2.logic;


import ru.itmo.lessons.courseworks.game2.menu.LogicMenu;

public class DecoderScenes {
    Steps steps = new Steps();
    Scenes scenes = new Scenes();
    LogicMenu logicMenu = new LogicMenu();


    public void startNextScene(String scene,String code){
        System.out.println(scene);
        LogicGame logicGame = new LogicGame();
        logicGame.chuseAnswear(code);

    }


    public String nextFirstScene(String code) {
        if (code.equals(scenes.firstSceneCode)) {
            System.out.println(steps.scenesForFirstСhoice.get(code));
            logicMenu.firstMenu();
            logicMenu.commandForFirstMenu();
        }

        else System.out.println(steps.scenesForFirstСhoice.get(code));
        LogicGame logicGame = new LogicGame();
        logicGame.chuseAnswear(code);

        return code;
    }

    public String nextSecondScene(String code) {
        startNextScene(steps.scenesForSecondСhoice.get(code),code);

        return code;
    }


}
