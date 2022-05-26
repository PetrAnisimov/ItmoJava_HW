package ru.itmo.lessons.courseworks.game2.menu;

import ru.itmo.lessons.courseworks.game2.menu.commandsMenu.ExitGame;
import ru.itmo.lessons.courseworks.game2.menu.commandsMenu.LoadGame;
import ru.itmo.lessons.courseworks.game2.menu.commandsMenu.SaveCommand;

public class Menu {
    Command start;
    Command load;
    Command save;
    Command exit;

    public Menu(SaveCommand saveCommand, LoadGame loadGame, ExitGame exitGame) {
        this.load = loadGame;
        this.save = saveCommand;
        this.exit = exitGame;
    }

    public Menu(Command start, Command load, Command save, Command exit) {
        this.start = start;
        this.load = load;
        this.save = save;
        this.exit = exit;
    }

    public Menu(Command exit){
        this.exit = exit;
    }

    public void startGame(){
        start.execute();
    }

    public void loadGame(){
        load.execute();
    }

    public void saveGame(){
        save.execute();
    }

    public void exitGame(){
        exit.execute();
    }
}
