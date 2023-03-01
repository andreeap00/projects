package model;

public class SaveTheDogs implements Shelters {
    private String name;
    private String location;
    private Integer dogNumber;
    private Integer largeDogsNumber;
    private Integer smallDogsNumber;
    private DogAttendant dogAttendant;
    private PossibleTrainer trainer;

    public void setDogAttendant(DogAttendant dogAttendant) {
        this.dogAttendant = dogAttendant;
    }

    public void setTrainer(PossibleTrainer trainer) {
        this.trainer = trainer;
    }

    //methods from interface Shelters
    public String getShelterName() {
        return this.name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getDogNumber() {
        return this.dogNumber;
    }

    public void setDogNumber(Integer dogNumber) {
        this.dogNumber = dogNumber;
    }

    public Integer getLargeDogsNumber() {
        return largeDogsNumber;
    }

    public void setLargeDogsNumber(Integer largeDogsNumber) {
        this.largeDogsNumber = largeDogsNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSmallDogsNumber() {
        return smallDogsNumber;
    }

    public void setSmallDogsNumber(Integer smallDogsNumber) {
        this.smallDogsNumber = smallDogsNumber;
    }

    @Override
    public String toString() {
        return "SaveTheDogs Shelter { \n"
                + " name = " + name + "\n"
                + " location = " + location + "\n"
                + " nr of dogs = " + dogNumber + "\n"
                + " dogAttendant = " + dogAttendant.getName() + "\n"
                + " trainer = " + trainer + "\n"
                + " the number of large dogs = " + largeDogsNumber + "\n"
                + " the number of small dogs = " + smallDogsNumber + "\n"
                + "}";
    }
}

