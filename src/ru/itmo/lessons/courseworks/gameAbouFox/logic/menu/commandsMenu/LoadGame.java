package ru.itmo.lessons.courseworks.gameAbouFox.logic.menu.commandsMenu;


import ru.itmo.lessons.courseworks.gameAbouFox.logic.menu.Command;
import ru.itmo.lessons.courseworks.gameAbouFox.logic.menu.JobMenu;

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
