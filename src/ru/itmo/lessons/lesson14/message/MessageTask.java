package ru.itmo.lessons.lesson14.message;

import java.util.*;

public class MessageTask implements Comparable<Message> {


    public static void countEachPriority(List<Message> messageList) {
        int lowElement = 0;
        int mediumElement = 0;
        int highElement = 0;
        int urgentElement = 0;
        for (Message message : messageList) {
            if (message.getPriority() == MessagePriority.LOW) lowElement++;
            if (message.getPriority() == MessagePriority.MEDIUM) mediumElement++;
            if (message.getPriority() == MessagePriority.HIGH) highElement++;
            if (message.getPriority() == MessagePriority.URGENT) urgentElement++;
        }
        System.out.println("Количество сообщений с приоритетом LOW: " + lowElement);
        System.out.println("Количество сообщений с приоритетом MEDIUM: " + mediumElement);
        System.out.println("Количество сообщений с приоритетом HIGH: " + highElement);
        System.out.println("Количество сообщений с приоритетом URGENT: " + urgentElement);
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль
    }

    public static void countEachCode(List<Message> messageList) {
        //мне кажется оченть примитивная реализация, скорее всего тут можно использовать
        //перебор массива, но что то у меня не вышло это((
        int code0 = 0;
        int code1 = 0;
        int code2 = 0;
        int code3 = 0;
        int code4 = 0;
        int code5 = 0;
        int code6 = 0;
        int code7 = 0;
        int code8 = 0;
        int code9 = 0;
        int code10 = 0;
        for (Message message : messageList) {
            if (message.getCode() == 0) code0++;
            if (message.getCode() == 1) code1++;
            if (message.getCode() == 2) code2++;
            if (message.getCode() == 3) code3++;
            if (message.getCode() == 4) code4++;
            if (message.getCode() == 5) code5++;
            if (message.getCode() == 6) code6++;
            if (message.getCode() == 7) code7++;
            if (message.getCode() == 8) code8++;
            if (message.getCode() == 9) code9++;
            if (message.getCode() == 10) code10++;
        }
        System.out.println("Код 0 встретился " + code0 + " раз");
        System.out.println("Код 1 встретился " + code1 + " раз");
        System.out.println("Код 2 встретился " + code2 + " раз");
        System.out.println("Код 3 встретился " + code3 + " раз");
        System.out.println("Код 4 встретился " + code4 + " раз");
        System.out.println("Код 5 встретился " + code5 + " раз");
        System.out.println("Код 6 встретился " + code6 + " раз");
        System.out.println("Код 7 встретился " + code7 + " раз");
        System.out.println("Код 8 встретился " + code8 + " раз");
        System.out.println("Код 9 встретился " + code9 + " раз");
        System.out.println("Код 10 встретился " + code10 + " раз");
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль

    }

    public static void uniqueMessageCount(List<Message> messageList) {

        int iter = 0;
        int uniqMes = 0;
        HashSet<Message> uniqHashSet = new HashSet<>(messageList);
        for (Message message : uniqHashSet) {
            uniqMes++;
        }
        System.out.println("Уникальных значений: " + uniqMes);
    }

    // TODO: Подсчитать количество уникальных сообщений
    //  Ответ в консоль

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {


        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return null;
    }

    public static void removeEach(List<Message> messageList, MessagePriority priority) {
        System.out.println("Оригинал: " + messageList);
        Iterator<Message> messageIterator = messageList.iterator();
        while (messageIterator.hasNext()) {

            Message nextMessage = messageIterator.next();
            if (nextMessage.getPriority().equals(priority)) {
                messageIterator.remove();
            }
        }
        System.out.println("Новый: " + messageList);
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
    }

    public static void removeOther(List<Message> messageList, MessagePriority priority) {
        System.out.println("Оригинал: " + messageList);
        Iterator<Message> messageIterator = messageList.iterator();
        while (messageIterator.hasNext()) {

            Message nextMessage = messageIterator.next();
            if (nextMessage.getPriority() != priority) {
                messageIterator.remove();
            }
        }
        System.out.println("Новый: " + messageList);
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
    }

    @Override
    public int compareTo(Message o) {
        return 0;
    }

    public static void main(String[] args) {

    }

}




