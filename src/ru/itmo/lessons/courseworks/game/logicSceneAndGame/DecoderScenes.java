package ru.itmo.lessons.courseworks.game.logicSceneAndGame;

public class DecoderScenes {
    Steps steps = new Steps();

    public String decoder(String code){
        return steps.getSceneFirstСhoice().get(code);
    }

    public String decoderFirstButton(String code){
        return steps.getSceneFirstСhoice().get(code);
    }

    public String decoderSecondButton(String code){
        return steps.getSceneSecondСhoice().get(code);
    }

}





