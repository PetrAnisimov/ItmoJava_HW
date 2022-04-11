package ru.itmo.lessons.courseworks.fitness;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Calendar;

public class Fitness {

    LocalTime localTime = LocalTime.now();
    String timeStamp = new SimpleDateFormat("yyyy-MM-dd: HH:mm").format(Calendar.getInstance().getTime());
    LocalTime timeForClouse = LocalTime.of(22, 00);
    LocalTime timeForOpen = LocalTime.of(8, 00);


    Abonement[] swimingpool = new Abonement[20];
    Abonement[] gym = new Abonement[20];
    Abonement[] groupsLessons = new Abonement[20];


    public void addToSwimingPoolArray(Abonement abonement) {
        for (int i = 0; i < swimingpool.length; i++) {
            if (swimingpool[i] == null) {
                swimingpool[i] = abonement;
                System.out.println(abonement.getOwner() + " добавлен в бассейн. Дата" +
                        "и время посещения " + timeStamp);
                return;
            }
        }
        System.out.println("Бассейн перепеолнен");
    }

    public void addToGymArray(Abonement abonement) {
        for (int i = 0; i < gym.length; i++) {
            if (gym[i] == null) {
                gym[i] = abonement;
                System.out.println(abonement.getOwner() + " добавлен в зону спорт зал. Дата" +
                        "и время посещения " + timeStamp);
                return;
            }
        }
        System.out.println("В зале больше нет мест");
    }

    public void addToGroupLessons(Abonement abonement) {
        for (int i = 0; i < groupsLessons.length; i++) {
            if (groupsLessons[i] == null) {
                groupsLessons[i] = abonement;
                System.out.println(abonement.getOwner() + " добавлен в зону Групповых тренеровок. Дата" +
                        "и время посещения " + timeStamp);
                return;
            }
        }
        System.out.println("В зале групповых тренировок" +
                " больше нет мест");
    }

    public boolean isOpenGym(LocalTime timeForClouse) {
        if (localTime.isAfter(timeForClouse) || localTime.isBefore(timeForOpen)) {
            for (int i = 0; i < 20; i++) {
                swimingpool[i] = null;
                gym[i] = null;
                groupsLessons[i] = null;
            }
            System.out.println("Зал закрты. Часы работы зала ч 8:00 до 22:00");
            return false;
        }
        return true;
    }


    public boolean checkExpDate(Abonement abonement) {
        if (abonement.getExpireDate().isAfter(abonement.getFirstRegistrationDate())) {
            System.out.println("Абонимент истек");
        }
        return false;
    }

    public boolean checkAvalibleZoneForAbonement(Abonement abonement, Zone zone) {
        for (Zone zone1 : abonement.getZone()) {
            if (zone1 == zone) return true;
        }
        System.out.println("Уважаемый " + abonement.getOwner().getName() + " данная " +
                " зона не подходит вам по абонименту");
        return false;
    }


    public boolean checkZoneForAddToArray(Abonement abonement, Zone zone) {

        if (zone.ordinal() == 0) {
            addToGymArray(abonement);
            return true;
        }
        if (zone.ordinal() == 1) {
            addToSwimingPoolArray(abonement);
            return true;
        }
        if (zone.ordinal() == 2) {
            addToGroupLessons(abonement);
            return true;
        }
        return false;
    }


    public void visitToFitnes(Abonement abonement, Zone zone) {
        if (checkExpDate(abonement)) return; //работает
        if (!isOpenGym(timeForClouse)) return;//работает
        if (!checkAvalibleZoneForAbonement(abonement, zone)) return; //работает
        if (checkZoneForAddToArray(abonement, zone)) return;//работает
    }

    public void getInfoByZone(Zone zone) {
        if (zone.equals(Zone.GYM)) {
            for (Abonement gym1 : gym) {
                if (!(gym1 ==null)){
                    System.out.println("Данные о посетителе спорт зала "+ gym1.getOwner());
                }
            }return;
        }
        if (zone.equals(Zone.SWIMINGPOOL)){
            for (Abonement swimmingpool1 : swimingpool) {
                if (!(swimmingpool1 == null)){
                    System.out.println("Данные о посетителе бассейна "+ swimmingpool1.getOwner());
                }
            }return;
        }
        if (zone.equals(Zone.GROUPSLESSONS)){
            for (Abonement groupsLesson1 : groupsLessons) {
                if (!(groupsLesson1 == null)){
                    System.out.println("Данные о посетителе зала групповых тренировок "+ groupsLesson1.getOwner());
                }
            }return;
        }
    }


    //тестовый метод (проверка массивов)
    public void getAllDataFromArrays() {
        System.out.println("Массив бассейн: " + Arrays.toString(swimingpool));
        System.out.println("Массив зал: " + Arrays.toString(gym));
        System.out.println("Массив групповые занятия: " + Arrays.toString(groupsLessons));
    }

}
