package model;

public class Dog {
    private Integer age;
    private Integer mass;
    private Integer length;


    public Dog(Integer age, Integer mass, Integer length) {
        this.age = age;
        this.mass = mass;
        this.length = length;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }


}
