package ru.itmo.lessons.lesson10.base;

abstract public class Properties {
    private String color;
    private String company;
    private int level;

    public Properties(String color, String company, int level) {
        setColor(color);
        setCompany(company);
        setLevel(level);
    }


    public void changeColor(String color){
        this.color = color;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) throw new IllegalArgumentException("color " +
                "не может быть пустым");
        this.color = color;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null) throw new IllegalArgumentException("company не может быть" +
                " пустым");
        this.company = company;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
//        if (this.getLevel()>=0 && this.getLevel()<=10) throw new IllegalArgumentException("level не может" +
//                "быть меньше нуля и больще 10");
        this.level = level;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "color='" + color + '\'' +
                ", company='" + company + '\'' +
                ", level=" + level +
                '}';
    }
}
