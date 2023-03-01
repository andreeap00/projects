package controller;

import model.Adoption;
import model.Certificate;
import model.Model;
import view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

    private final View theView;
    private final Model theModel;

    public Controller(View theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.makeCertificateListener(new Listener());
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = theView.nameTextField.getText();
            String surname = theView.surnameTextField.getText();
            String adress = theView.adressTextField.getText();
            int animalsAtHome = Integer.parseInt(theView.animalsAtHomeTextField.getText());
            theModel.setAdoptersData(name, surname, adress, animalsAtHome);

            int dogAge = Integer.parseInt(theView.dogAgeTextField.getText());
            Adoption adoption = theModel.setAdoptionData(dogAge);

            Certificate certificate = new Certificate();
            String s = certificate.generate(adoption);
            theView.setTextToCertificateLabel(s);
        }
    }
}
