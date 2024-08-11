package com.springcore.ci;
public class Person {
    private String name;
    private String id;
    private Certi certi;

    public Person(String name, String id, Certi certi) {
        this.name = name;
        this.id = id;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", certi=" + certi +
                '}';
    }
}
