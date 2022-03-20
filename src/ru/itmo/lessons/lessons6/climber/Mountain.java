package ru.itmo.lessons.lessons6.climber;

public class Mountain {
    private String mountain;
    private String country;
    private int height;

    public String getMountain() {
        return mountain;
    }

    public void setMountain(String mountain) {
        if (mountain == null || mountain.length() < 4) throw new IllegalArgumentException("mountain не может быть null или меньше 4");
        this.mountain = mountain;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.length() < 3) throw new IllegalArgumentException("country не может быть null или меньше 4");
        this.country = country;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height < 100) throw new IllegalArgumentException("height не может быть меньше 100");
        this.height = height;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "mountain='" + mountain + '\'' +
                ", country='" + country + '\'' +
                ", height=" + height +
                '}';
    }
}
//Гора создаётся с названием (не менее 4 символов), страной (не менее 4 символов) и высотой (не менее 100 метров)