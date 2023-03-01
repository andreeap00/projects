package model;

public class Adoption {
    private Adopter adopter;
    private Trainer trainer;
    private String adoptionDate;
    private Dog dog;
    private Integer numberOfDogsToAdopt;


    public Adoption(Adopter adopter, Dog dog) {
        this.adopter = adopter;
        this.dog = dog;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getAdoptionDate() {
        return adoptionDate;
    }

    public void setAdoptionDate(String adoptionDate) {
        this.adoptionDate = adoptionDate;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Integer getNumberOfDogsToAdopt() {
        return numberOfDogsToAdopt;
    }

    public void setNumberOfDogsToAdopt(Integer numberOfDogsToAdopt) {
        this.numberOfDogsToAdopt = numberOfDogsToAdopt;
    }

    public String adoptedDog(){
        return "Congratulations for your new buddy, " + this.adopter.getName()+ "!";
    }

}
