package ru.itmo.lessons.lessons6.climber;

import java.util.Arrays;

public class Group {
    public boolean isOpentoAdd = false;
    private Mountain mountain;
    private Climber climber;


    private Climber[] climbers = new Climber[3];

    public Group(boolean isOpentoAdd, Mountain mountain) {
        this.isOpentoAdd = isOpentoAdd;
        this.mountain = mountain;

    }

    public void addToGroup(Climber climber) {
        if (!isOpentoAdd){
            System.out.println("Набор закрыт");
            return;
        }
        for (int i = 0; i < climbers.length; i++) {
            if (climbers[i] == null) {
                climbers[i] = climber;
                return;
            }

        }
        System.out.println("Альпинист добавлен");
    }

    @Override
    public String toString() {
        return "Group{" +
                "isOpentoAdd=" + isOpentoAdd +
                ", mountain='" + mountain + '\'' +
                ", groups=" + Arrays.toString(climbers) +
                '}';
    }


}


/*
Группа для восхождения на гору создаётся со следующими характеристиками и возможностями:
идёт набор в группу или нет;
массив альпинистов;
гора;
должна быть возможность добавить альпиниста в группу, если набор ещё идёт
 */