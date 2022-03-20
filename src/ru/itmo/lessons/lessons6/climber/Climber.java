package ru.itmo.lessons.lessons6.climber;

public class Climber {
    private String nameOfClimber;
    private String addressOfClimber;

    public String getNameOfClimber() {
        return nameOfClimber;
    }

    public void setNameOfClimber(String nameOfClimber) {
        if (nameOfClimber == null || nameOfClimber.length() < 3)
            throw new IllegalArgumentException("nameOfClimber не может быть null или менее трех");
        this.nameOfClimber = nameOfClimber;
    }

    public String getAddressOfClimber() {
        return addressOfClimber;
    }

    public void setAddressOfClimber(String addressOfClimber) {
        if (addressOfClimber == null || addressOfClimber.length() < 5)
            throw new IllegalArgumentException("addressOfClimber не может быть null или менее пяти");
        this.addressOfClimber = addressOfClimber;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "nameOfClimber='" + nameOfClimber + '\'' +
                ", addressOfClimber='" + addressOfClimber + '\'' +
                '}';
    }
}
//Альпинист создаётся с именем (не менее 3 символов) и адресом проживания (не менее 5 символов).