package ru.itmo.lessons.courseworks.game.menu.commandsMenu;


import ru.itmo.lessons.courseworks.game.menu.Command;
import ru.itmo.lessons.courseworks.game.menu.JobMenu;

public class LoadGame implements Command {
    JobMenu menu;

    public LoadGame(JobMenu menu) {
        this.menu = menu;
    }

    @Override
    public void execute() {
        menu.loadGame();
    }
}
