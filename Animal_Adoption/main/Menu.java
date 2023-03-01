package main;


import controller.Controller;
import model.*;
import view.View;

public class Menu {
    public static void main(String[] args) {
        View clientFrame = new View();
        Model model = new Model();
        Controller controller = new Controller(clientFrame, model);

        SaveTheDogs mySaveTheDogs =new SaveTheDogs();
        mySaveTheDogs.setName(ShelterNames.THE_HOPE_STAR.name());
        mySaveTheDogs.setLocation("Cluj-Napoca");

        mySaveTheDogs.setLargeDogsNumber(20);
        mySaveTheDogs.setSmallDogsNumber(24);
        mySaveTheDogs.setDogNumber(mySaveTheDogs.getLargeDogsNumber()+mySaveTheDogs.getSmallDogsNumber());

        DogAttendant dogAttendant = new DogAttendant();
        dogAttendant.setName("Jonathan Joestar");
        dogAttendant.setStartJobDate("11/11/2021");
        mySaveTheDogs.setDogAttendant(dogAttendant);


        PossibleTrainer possibleTrainer1 = new PossibleTrainer("Light Yatagami", 30,MainReason.LOVE_FOR_DOGS);
        mySaveTheDogs.setTrainer(possibleTrainer1);

        System.out.println("Shelter data:" + mySaveTheDogs);
    }
}
