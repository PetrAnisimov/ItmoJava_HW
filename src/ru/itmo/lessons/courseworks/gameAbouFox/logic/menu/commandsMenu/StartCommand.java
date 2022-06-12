package ru.itmo.lessons.courseworks.gameAbouFox.logic.menu.commandsMenu;

import ru.itmo.lessons.courseworks.gameAbouFox.logic.menu.Command;
import ru.itmo.lessons.courseworks.gameAbouFox.logic.menu.JobMenu;

public class StartCommand implements Command {
    JobMenu menu;

    public StartCommand(JobMenu menu) {
        this.menu = menu;
    }

    @Override
    public void execute()  {
        menu.startGame();
    }
}
