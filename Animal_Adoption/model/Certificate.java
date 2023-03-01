package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Certificate {
    public String generate(Adoption adoption) {
        String s = "";
        try {
            File file = new File("certificate.txt");
            FileWriter myWriter = new FileWriter("certificate.txt");
            myWriter.write("Certificate:" + "\n"
                    + "Name:" + adoption.getAdopter().toString() + "\n"
                    + "Surname:" + adoption.getAdopter().getSurname() + "\n"
                    + "Adress:" + adoption.getAdopter().getAdress() + "\n"
                    + "Animals at home:" + adoption.getAdopter().getNumberAnimalsAtHome() + "\n"
                    + "Dog age:" + adoption.getDog().getAge() + "\n"
                    + "\n" + adoption.adoptedDog());
            s = s + "Certificate:" + "\n"
                    + "Name:" + adoption.getAdopter().toString() + "\n"
                    + "Surname:" + adoption.getAdopter().getSurname() + "\n"
                    + "Adress:" + adoption.getAdopter().getAdress() + "\n"
                    + "Animals at home:" + adoption.getAdopter().getNumberAnimalsAtHome() + "\n"
                    + "Dog age:" + adoption.getDog().getAge() + "\n"
                    + "\n" + adoption.adoptedDog();
            myWriter.close();
            if (file.createNewFile()) {
                System.out.println("The file is created " + file.getName());
            } else {
                System.out.println("The file has been already accessed");
            }
        } catch (IOException e) {
            System.out.println("E404.");
            e.printStackTrace();
        }
        return s;
    }
}
