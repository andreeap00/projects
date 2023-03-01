package model;

import java.util.Date;

public class Trainer implements Human {
    private String name;
    private MainReason mainReason;
    private Date dateOfEmployment;

    public Trainer(String name) {
        this.name = name;
    }

    public Trainer(String name, MainReason mainReason, Date dateOfEmployment) {
        this.name = name;
        this.mainReason = mainReason;
        this.dateOfEmployment = dateOfEmployment;
    }


    //methods from Human interface
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MainReason getTopSkill() {
        return this.mainReason;
    }

    public void setTopSkill(MainReason mainReason) {
        this.mainReason = mainReason;
    }

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }
}