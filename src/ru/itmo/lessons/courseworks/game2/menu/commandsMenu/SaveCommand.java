package ru.itmo.lessons.courseworks.game2.menu.commandsMenu;

import ru.itmo.lessons.courseworks.game2.menu.Command;
import ru.itmo.lessons.courseworks.game2.menu.JobMenu;

public class SaveCommand implements Command {
    JobMenu menu;

    public SaveCommand(JobMenu menu) {
        this.menu = menu;
    }

    @Override
    public void execute()  {
        menu.saveGame();

    }
}
