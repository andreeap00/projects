package model;

public class Adopter implements Human {
    private String name;
    private String surname;
    private String adress;
    private String hasOtherAnimals;
    private Integer numberAnimalsAtHome;
    private Adoption adoption;


    public Adopter(String name, String surname, String adress, Integer numberAnimalsAtHome) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.numberAnimalsAtHome = numberAnimalsAtHome;
    }

    //methods from Human interface
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getHasOtherAnimals() {
        return hasOtherAnimals;
    }

    public void setHasOtherAnimals(String hasOtherAnimals) {
        this.hasOtherAnimals = hasOtherAnimals;
    }

    public Integer getNumberAnimalsAtHome() {
        return numberAnimalsAtHome;
    }

    public void setNumberAnimalsAtHome(Integer numberAnimalsAtHome) {
        this.numberAnimalsAtHome = numberAnimalsAtHome;
    }

    public Adoption getAdoption() {
        return adoption;
    }

    public void setAdoption(Adoption adoption) {
        this.adoption = adoption;
    }



    @Override
    public String toString() {
        return "Adopter{" +
                "name='" + name + '\'' +
                ", has" + numberAnimalsAtHome + " animals at home"+
                '}';
    }
}

