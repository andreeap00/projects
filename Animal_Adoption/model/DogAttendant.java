package model;

public class DogAttendant implements Human {
    //private final String ocupation = "DogAttendant"; //the ocupation for objects of type DogAttendant is always "DogAttendant", so I set it final(non-changeable)
    private String name;
    private String startJobDate;

    //methods from interface Human
    public String getName() {
        return this.name;
    }

    //getters and setters for the atributes(we need getters and setter bc are private)
    public void setName(String name) {
        this.name = name;
    }

    public void setStartJobDate(String startJobDate) {
        this.startJobDate = startJobDate;
    }

    @Override
    public String toString() {
        return "DogAttendant{" +
                "name='" + name + '\'' +
                ", employmentDate='" + startJobDate + '\'' +
                '}';
    }
}
