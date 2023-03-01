package model;

public class PossibleTrainer implements Human {
    private String name;
    private Integer age;
    private MainReason mainReason;


    public PossibleTrainer(String name, Integer age, MainReason mainReason) {
        this.name = name;
        this.age = age;
        this.mainReason = mainReason;
    }

    //methods  from Human interface
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MainReason getMainReason() {
        return this.mainReason;
    }

    public void setMainReason(MainReason mainReason) {
        this.mainReason = mainReason;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "PossibleTrainer -> " +
                "His/her name: " + name + "; is aged " + age +
                ". The mainReason to work at the dog shelter is " + mainReason;
    }
}
