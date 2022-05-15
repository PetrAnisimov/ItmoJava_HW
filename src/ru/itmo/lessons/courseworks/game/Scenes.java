package ru.itmo.lessons.courseworks.game;

import ru.itmo.lessons.courseworks.game.logicSceneAndGame.LogicGame;

public class Scenes {
    LogicGame logicGame = new LogicGame();
    Game game = new Game();

    public String codeFirstScene = "firstScene";
    public String firstSceneAction() {
        String firstSceneAction = """
                Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком.
                Это утро не было исключением. Лисёнок пришёл на их обычное место встречи,
                 но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга.
                " Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду." - подумал Лисёнок. Как поступить Лисенку?
                            
                Выберите пункт:
                1: Вернуться домой
                2: Отправиться на поиски
                3: Вызвать меню"
                Введите пункт меню:           
                """;
        System.out.println(firstSceneAction);
        logicGame.chuseAnswear(codeFirstScene);
        return firstSceneAction;
    }

    public String codeGoHomeScene = "goHome";
    public String goHomeAction() {
        String goHomeAction = """
                Вернувшись домой, Лисёнок нашёл там Бельчонка.
                Оказалось, что Бельчонок пришёл на место встречи раньше и
                увидел там рой злобных пчел. Он поспешил предупредить об этом Лисёнка,
                но они разминулись.
                Наконец-то друзья нашли друг друга! 
                                
                ==> Игра завершилась успехом <==
                """;
        System.out.println(goHomeAction);
        game.menu();
        return null;
    }

    public String codeGoToSearch = "goToSearch";
    public String goToSearchAction() {
        String goToSearchAction = """
                Все лесные жители были заняты своими делами и не обращали внимания
                на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка...
                Лисёнок не знал, что ему делать. Помогите ему.
                            
                Выберите пункт:
                1: Попытаться разузнать о Бельчонке у лесных жителей
                2: Искать Бельчонка в одиночку
                3: Вызвать меню"
                Введите пункт меню:  
                """;
        System.out.println(goToSearchAction);
        logicGame.chuseAnswear(codeAskAboutLittleSquirrel);
        return goToSearchAction;
    }

    public String codeAskAboutLittleSquirrel = "askAboutLittleSquirrel";
    public String askAboutLittleSquirrelAction() {
        String askAboutLittleSquirrel = """
                Пока Лисёнок принимал решение, лесные жители разошлись кто куда.
                Остались только Сова и Волк. Но у Совы бывают проблемы с памятью,
                а Волк может сильно разозлиться из-за расспросов. Кого выбрать?
                 
                 Выберите пункт:
                 1: Расспросить Сову
                 2: Расспросить Волка
                 3: Вызвать меню"
                 Введите пункт меню:  
                 """;
        System.out.println(askAboutLittleSquirrel);
        logicGame.chuseAnswear(codeSearchLittleSquirrelAlone);
        return askAboutLittleSquirrel;
    }

    public String codeSearchLittleSquirrelAlone = codeAskAboutLittleSquirrel;
    public String searchLittleSquirrelAloneAction() {
        String searchLittleSquirrelAloneAction = """
                Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил,
                как заблудился. Теперь его самого нужно искать. 
                                
                ==> Игра завершилась неудачей <==
                """;
        System.out.println(searchLittleSquirrelAloneAction);
        game.menu();
        return null;
    }


    public String showScene(String scene) {
        System.out.println(scene);
        return scene;
    }

    public String nextScene(String code) {
        showScene(code);
        logicGame.chuseAnswear(code);
        return code;
    }

}


