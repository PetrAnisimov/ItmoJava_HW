package ru.itmo.lessons.courseworks.gameAbouFox.logic;


import java.util.HashMap;


public class Scenes {

    private final String sceneCode;
    private final String sceneScene;

    private Scenes first; // на ответ 1
    private Scenes second; // на ответ 2


    public Scenes(String sceneCode, String sceneScene) {
        this.sceneCode = sceneCode;
        this.sceneScene = sceneScene;
    }

    public String getSceneCode() {
        return sceneCode;
    }

    public String getSceneScene() {
        return sceneScene;
    }

    public Scenes getFirst() {
        return first;
    }

    public void setFirst(Scenes first) {
        this.first = first;
    }

    public Scenes getSecond() {
        return second;
    }

    public void setSecond(Scenes second) {
        this.second = second;
    }


    public static HashMap<String, Scenes> getScenes() {
        HashMap<String, Scenes> codeScene = new HashMap<>();
        Scenes firstSceneCode = new Scenes("firstSceneCode", """
                Каждое утро Лисёнок просыпался, завтракал и
                шёл увидеться с Бельчонком. Это утро не было
                исключением. Лисёнок пришёл на их обычное место
                встречи, но Бельчонка там не было. Лисёнок ждал,
                ждал, но так и не смог дождаться своего друга.
                " Бельчонок не пропустил еще ни одной встречи,
                вдруг он попал в беду." - подумал Лисёнок. Как поступить Лисенку?
                                
                Выбери ответ
                1) Вернуться домой
                2) Отправиться на поиски
                3) Меню
                """);
        Scenes goToSearchCode = new Scenes("goToSearchCode", """
                Все лесные жители были заняты своими делами и не
                обращали внимания на Лисёнка и его проблему.
                Но вдруг кто нибудь видел Бельчонка...
                Лисёнок не знал, что ему делать. Помогите ему.
                            
                Выбери ответ
                1) Попытаться разузнать о Бельчонке у лесных жителей
                2) Искать Бельчонка в одиночку
                3) Меню
                """);
        Scenes askAboutSquirrelToDwellersScene = new Scenes("askAboutSquirrelToDwellersScene", """
                Пока Лисёнок принимал решение, лесные жители разошлись
                кто куда. Остались только Сова и Волк. Но у Совы бывают
                проблемы с памятью, а Волк может сильно разозлиться из-за
                расспросов. Кого выбрать?
                            
                Выбери ответ
                1) Расспросить Сову
                2) Расспросить Волка
                3) Меню
                """);
        Scenes finalSceneScene = new Scenes("finalSceneScene", """
                Вернувшись домой, Лисёнок нашёл там Бельчонка.
                Оказалось, что Бельчонок пришёл на место встречи
                раньше и увидел там рой злобных пчел. Он поспешил
                предупредить об этом Лисёнка, но они разминулись.
                Наконец-то друзья нашли друг друга! 
                            
                ====> Игра завершилась успехом <==== 
                Нажмите цифру 3 для выхода в меню
                """);
        Scenes finalScene2Scene = new Scenes("finalScene2Scene", """
                Лисёнок слишком долго плутал по лесу в поисках друга
                и сам не заметил, как заблудился. Теперь его самого нужно искать.
                            
                ====> Игра завершилась неудачей <==== 
                Нажмите цифру 3 для выхода в меню
                """);
        Scenes askOwlAboutSquirrel = new Scenes("askOwlAboutSquirrel", """
                Сова долго не хотела говорить, но в итоге сказала, что видела 
                испуганного Бельчонка, бежавшего вглубь леса. Все лесные жители знают,
                что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь
                               
                Выбери ответ
                 1) Поверить Сове и отправиться в глубь леса
                 2) Сове не стоит верить
                 3) Меню
                 """);
        Scenes goToDeepForest = new Scenes ("goToDeepForest", """
                В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был 
                готов рассказать все, что знает, если Лисёнок принесёт ему мёда.
                
                Выбери ответ
                1) Нет, потрачено слишком много времени, нужно идти дальше 
                2) Нужно воспользоваться шансом и раздобыть мёд
                3) Меню
                """);
        Scenes askToWolf = new Scenes("askToWolf", """
                Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал,
                что маленькому лисенку не стоит бродить по лесу одному.
                И как теперь поступить?
                
                Выбери ответ
                1) Волк прав
                2) Искать Бельчонка в одиночку
                3) Меню
                """);
        Scenes getHoney = new Scenes("getHoney", """
                Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел.
                Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.
                               
                Выбери ответ
                1) Подождать, вдруг пчёлы улетят
                2) Нужно попытаться выкрасть мёд немедленно
                3) Меню        
                """);
        Scenes waitBeforeBeesGoOut = new Scenes("waitBeforeBeesGoOut", """
                Лисёнок подождал немного, и пчёлы разлетелись. 
                Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден.
                Что же делать?
                
                Выбери ответ
                1) Поесть немного и передохнуть
                2) Скорее отнести мёд Медвежонку
                3) Меню
                """);
        Scenes eatAndRest = new Scenes("eatAndRestCode", """
                Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь,
                 он не сможет продолжить поиски. Игра завершилась неудачей
                 
                 ====> Игра завершилась неудачей <==== 
                Нажмите цифру 3 для выхода в меню
                """);
        Scenes  bringHoneyToBear = new Scenes("bringHoneyToBearCode", """
                Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен,
                 что Бельчонок никогда не пошёл бы в глубь леса. Он заверял Лисёнка, что Белки не попадают в
                  неприятности, и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой.
                 
                 Выбери ответ
                1) Медвежонок ничего не знает, нужно продолжить поиски
                2) Может быть он прав и Лисёнок просто паникует
                """);
        Scenes finalScene3Scene = new Scenes("finalScene3Scene", """
                Это была не лучшая идея. Пчёлы покусали Лисёнка,
                теперь ему самому нужна помощь.
                
                ====> Игра завершилась неудачей <====
                Нажмите цифру 3 для выхода в меню                 
                """);



        firstSceneCode.setFirst(finalSceneScene);
        firstSceneCode.setSecond(goToSearchCode);

        goToSearchCode.setFirst(askAboutSquirrelToDwellersScene);
        goToSearchCode.setSecond(finalScene2Scene);

        askAboutSquirrelToDwellersScene.setFirst(askOwlAboutSquirrel);
        askAboutSquirrelToDwellersScene.setSecond(askToWolf);

        askToWolf.setFirst(finalSceneScene);
        askToWolf.setSecond(finalScene2Scene);

        askOwlAboutSquirrel.setFirst(goToDeepForest);
        askOwlAboutSquirrel.setSecond(finalScene2Scene);

        goToDeepForest.setFirst(finalScene2Scene);
        goToDeepForest.setSecond(getHoney);

        getHoney.setFirst(waitBeforeBeesGoOut);
        getHoney.setSecond(finalScene3Scene);

        waitBeforeBeesGoOut.setFirst(eatAndRest);
        waitBeforeBeesGoOut.setSecond(bringHoneyToBear);

        bringHoneyToBear.setFirst(finalScene2Scene);
        bringHoneyToBear.setSecond(finalSceneScene);


        codeScene.put(firstSceneCode.getSceneCode(), firstSceneCode);
        codeScene.put(goToSearchCode.getSceneCode(), goToSearchCode);
        codeScene.put(askAboutSquirrelToDwellersScene.getSceneCode(), askAboutSquirrelToDwellersScene);
        codeScene.put(askAboutSquirrelToDwellersScene.getSceneCode(), askAboutSquirrelToDwellersScene);
        codeScene.put(askToWolf.getSceneCode(),askToWolf);
        codeScene.put(goToDeepForest.getSceneCode(),goToDeepForest);
        codeScene.put(askOwlAboutSquirrel.getSceneCode(), goToDeepForest);
        codeScene.put(askOwlAboutSquirrel.getSceneCode(),askOwlAboutSquirrel);
        codeScene.put(getHoney.getSceneCode(), waitBeforeBeesGoOut);
        codeScene.put(getHoney.getSceneCode(), getHoney);
        codeScene.put(waitBeforeBeesGoOut.getSceneCode(),waitBeforeBeesGoOut);
        codeScene.put(waitBeforeBeesGoOut.getSceneCode(), bringHoneyToBear);
        codeScene.put(bringHoneyToBear.getSceneCode(),bringHoneyToBear);
        codeScene.put(bringHoneyToBear.getSceneCode(), bringHoneyToBear);

        return codeScene;
    }

    public static Scenes getScenesByCode(String sceneCode) {
        return getScenes().get(sceneCode);
    }



}






