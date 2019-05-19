package com.company;

public class Person {
    private String name;
    private String father;
    private String mother;

    public Person(String name, String father, String mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    public Person(String name, String mother) {
        this.name = name;
        this.mother = mother;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", father='" + father + '\'' +
                ", mother='" + mother + '\'' +
                '}';
    }
}
