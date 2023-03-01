package model;

public class Model {
    private Dog dog;
    private Adopter adopter;
    private Adoption adoption;

    public void setAdoptersData(String name, String surname, String adress, int animalsAtHome) {
        adopter = new Adopter(name, surname, adress, animalsAtHome);
    }

    public Adoption setAdoptionData(int age) {
        dog = new Dog(age, 20, 30);
        adoption = new Adoption(adopter, dog);
        return adoption;
    }
}
